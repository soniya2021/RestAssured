package CrudOperations_With_BDD;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class Read1Test {

	public static void main(String[] args) {
	
		given()
		.contentType(ContentType.JSON)
	.queryParams("page","2")
	.when().get("https://reqres.in/")
	.then().log().all();

	}

}
