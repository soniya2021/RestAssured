package CrudOperations_With_BDD;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class ReadTest {

	public static void main(String[] args) {

		given()
		.contentType(ContentType.JSON).
		queryParam("AuthorName","John foe")
		.when().get("http://216.10.245.166/Library/GetBook.php")
		.then().log().all();
		

	}

}
