package CrudOperations_With_BDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Update1Test {


	public static void main(String[] args) 
	{
		JSONObject json=new JSONObject();
		json.put("name","morpheus");
		json.put("job", "zion resident");

		given().
		contentType(ContentType.JSON)
		.body(json)
		.when()
		.put("https://reqres.in/api/users/2")
		.then().log().all();

	}

}
