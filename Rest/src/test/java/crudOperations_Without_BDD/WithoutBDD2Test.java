package crudOperations_Without_BDD;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WithoutBDD2Test {
	@Test
	public void withoutBDDTest() {

		JSONObject json=new JSONObject();
		json.put("body","{}");
		json.put("statusCode","100");
		json.put("statusCodeValue","0");
		RequestSpecification req=RestAssured.given();
		req.contentType(ContentType.JSON);
		Response resp=req.post("http://localhost:8084/addProject");
		String CompleteBody = resp.prettyPrint();
		System.out.println(CompleteBody);
		int sc = resp.getStatusCode();
		Assert.assertEquals(200, sc);
		String ct = resp.getContentType();
		Assert.assertEquals("application/json",ct);
	}
}
