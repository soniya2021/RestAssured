package CrudOperations_With_BDD;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class Create1Test {

	public static void main(String[] args) {

		JSONObject json=new JSONObject();
		 json.put("name","morpheus");
		 json.put("job","leader");
		 
		given()
		.contentType(ContentType.JSON).body(json)
		.when()
		.post("https://reqres.in/api/users").then().log().all();
		
		
		
	}

}
