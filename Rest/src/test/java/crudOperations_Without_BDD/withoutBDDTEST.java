package crudOperations_Without_BDD;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class withoutBDDTEST {

	@Test
	public void withoutBDDTEST() {
		JSONObject json=new JSONObject();

		json.put("createdBy","soniya21");
		json.put("projectName","bcd");
		json.put("status","on going");
		json.put("teamSize",10);
		RequestSpecification req=RestAssured.given();
		req.contentType(ContentType.JSON);

		Response resp=req.post("http://localhost:8084/addProject");
		String CompleteBody = resp.prettyPrint();
		System.out.println(CompleteBody);
		int sc = resp.getStatusCode();
		Assert.assertEquals(201, sc);
		String ct = resp.getContentType();
		Assert.assertEquals("application/json", ct);
	}
}
