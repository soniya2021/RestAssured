package CrudOperations_With_BDD;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class Read2Test {

	public static void main(String[] args) {
		
		given()
		.contentType(ContentType.JSON)
		.when().get("https://reqres.in/api/users?page=2")
		.then().log().all();
		
		
	}

}
