package CrudOperations_With_BDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class DeleteTest {

	public static void main(String[] args) {
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete("https://reqres.in/api/users/2")
		.then().log().all();
	}

}
