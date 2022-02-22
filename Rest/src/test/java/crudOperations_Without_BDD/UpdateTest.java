package crudOperations_Without_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import  io.restassured.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class UpdateTest {
	
	@Test
	
	public void updateTest() {
	JSONObject json=new JSONObject();
	json.put("createdBy","soniya21");
	json.put("projectName","bcd");
	json.put("status","on going");
	json.put("teamSize",10);
	
	RequestSpecification reqspec = RestAssured.given();
	reqspec.contentType(ContentType.JSON);
	reqspec.body(json);
	
	Response res = reqspec.put("http://localhost:8084/projects/TY_PROJ_2009");
	ValidatableResponse valres = res.then();
	valres.assertThat().statusCode(200);
	valres.log().all();
	
}	
}




