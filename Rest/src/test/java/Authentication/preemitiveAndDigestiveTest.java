package Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class preemitiveAndDigestiveTest {
	@Test
	public void preemitiveAuthTest()
	{
		given().auth().preemptive().basic("rmgyantra", "rmgy@9999")
		.when().get("http://;localhost:8084/login")
		//.when().get("http://localhost:8084/login")
		.then()
		.assertThat()
		.statusCode(202)
		.log().all();
	}

	public void digestiveAuthTest()
	{
		given().auth().digest("rmgyantra", "rmgy@9999")
		.when().get("http://;localhost:8084/login")
		.then()
		.assertThat()
		.statusCode(202).log().all();
	}
}

