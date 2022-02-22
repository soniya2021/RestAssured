package CrudOperations_With_BDD;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
public class UpdateTest {

	public static void main(String[] args) {

		JSONObject json=new JSONObject();
		json.put("ID" ,"bcd227");

		given().
		contentType(ContentType.JSON).
		body(json)
		.when()
		.post("http://216.10.245.166/Library/DeleteBook.php");

	}

}
