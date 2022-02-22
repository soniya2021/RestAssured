package crudOperations_Without_BDD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateTest {
@Test
public void createTest()
{
	//create an object for random number
	Random r = new Random();
	int rnum = r.nextInt(2000);
	
	JSONObject jobj= new JSONObject();
	jobj.put("createdBy","soniya");
	jobj.put("projectName","abcd"+rnum);
	jobj.put("status","ongoing");
	jobj.put("teamSize",10);
	
	RequestSpecification reqspc=RestAssured.given();
	reqspc.contentType(ContentType.JSON);
	reqspc.body(jobj);
	
	io.restassured.response.Response res = reqspc.post("http://localhost:8084/addProject");
	ValidatableResponse valres = res.then();
	valres.assertThat().statusCode(201);
	valres.log().all();
}

}