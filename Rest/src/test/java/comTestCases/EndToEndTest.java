package comTestCases;

import org.testng.annotations.Test;

import com.RMGYantra_Generic_Librerry.DataBaseUtility;
import com.RMGYantra_Generic_Librerry.JavaUtility;
import com.RMGYantra_POJO_Class.Pojo_Library;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class EndToEndTest extends DataBaseUtility{
@Test
public void endToEndTest() throws Throwable
{
	JavaUtility jUtil = new JavaUtility();
	DataBaseUtility dbUtility = new DataBaseUtility();
	Pojo_Library pl = new Pojo_Library("Satya", "Mechino"+jUtil.RandomNum(), "Created", 10);

	Response resp=given()
	.contentType(ContentType.JSON)
	.body(pl)
	.when()
	.post("http://localhost:8084/addProject");
	 
	String proId= resp.jsonPath().get("projectId");
	System.out.println("proId");
	
	Response resp1=given()
			.pathParams("projectId", proId)
			.body(pl)
			.when()
			.get("http://localhost:8084/Project/{projectId}");
			 
			String proname= resp1.jsonPath().get("projectName");
			System.out.println("proName");
			
	
	dbUtility.connecttoDataBase();
	res=dbUtility.executeQuery("select * from project");
	while(res.next())
	{
		if(res.getString(4).equals(proname))
		{
			System.out.println(proname+" is matching");
		}
	}
		
	dbUtility.closeBD();
	
}
}


