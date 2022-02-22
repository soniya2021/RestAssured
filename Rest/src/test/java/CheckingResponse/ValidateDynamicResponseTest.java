package CheckingResponse;

import org.testng.annotations.Test;

import  io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class ValidateDynamicResponseTest {
	@Test
	public void validateDynamicResponseTest()
	{
		String expData = "zoho";
		
		Response resp = when().get("http://localhost:8084/projects");
		resp.then().assertThat().statusCode(200);
		
		List<String> listData = resp.jsonPath().get("projectName");
		
		for(String oneData:listData)
		{
			if(oneData.equals(expData))
			{
				System.out.println(oneData+" is Present");
				break;
			}
		}
		resp.then().log().all();
}
}