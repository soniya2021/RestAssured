package CrudOperations_With_BDD;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateTest {

	public static void main(String[] args) {
		
		JSONObject json=new JSONObject();

		json.put("name","Learn Appium Automation with Java");
        json.put("isbn","bcd");
        json.put("aisle","227");
        json.put("author","John foe");
        
      given().
      contentType(ContentType.JSON)
      .body(json)
      .when()
      .post("http://216.10.245.166/Library/Addbook.php").then().log().all();
      
     
        
        
		}

	}


