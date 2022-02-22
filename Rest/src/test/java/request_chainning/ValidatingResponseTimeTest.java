package request_chainning;


import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;

public class ValidatingResponseTimeTest {

	@Test
	public void validatingResponsetTimeTest() 
	{


		when()
		.get("http:/localhost:8084/projects")
		.then()
		.assertThat().time(Matchers.lessThan(3000L),TimeUnit.MILLISECONDS)
		.assertThat().body("[2].projectName", Matchers.equalTo("Jyothika"))
		.log().all();
		
	}

}