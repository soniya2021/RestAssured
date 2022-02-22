package Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BarearTokenTest {
	@Test
	public void BarearTokenTest() 
	{
		given().auth().oauth2("ghp_dkpFiNYaVo5fJTNqPGvK3HZIQJf8o33XqyI")
		.when().get("https://api.github.com/user/repos")
		.then()
		.log().all();

	}
}
