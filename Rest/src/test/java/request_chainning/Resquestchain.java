package request_chainning;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Resquestchain {
	@Test
	public void requestchain() {
		Response resp = given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:8084/projects");


		String proID = resp.jsonPath().get("[1].projectId");
		System.out.println(proID);
		given()
		.contentType(ContentType.JSON)
		.pathParam("TY_PROJ_006",proID)
		.when()
		.delete("http://localhost:8084/projects/{TY_PROJ_006}")
		.then()
		.assertThat().statusCode(204);





	}
}
