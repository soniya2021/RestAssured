package CrudOperations_With_BDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class PatchTest {

	public static void main(String[] args) {
		JSONObject json=new JSONObject();
		json.put("name","morp");
		json.put("job", "zion rest");

		given().
		contentType(ContentType.JSON)
		.body(json)
		.when()
		.patch("https://reqres.in/api/users/2")
		.then().log().all();

	}

}
