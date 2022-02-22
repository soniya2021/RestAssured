package CheckingResponse;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.response.Response.*;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class ValidateStaticResponseTest {
	@Test
	public void validateStaticResponseTest()
	{ 
		String expData="TYSS_4545";

		Response resp=when().get("http://localhost:8084/");
		resp.then().assertThat().statusCode(200);
		String actData = resp.jsonPath().get("[4].projectName");
		System.out.println(actData);
		Assert.assertEquals(actData,expData);
	}

}
