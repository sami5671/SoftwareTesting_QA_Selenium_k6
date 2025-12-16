package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.hamcrest.Matchers.*;

public class LoginAPITest {
	
	@Test(description = "Verify if Login API is working....")
	public void loginTest() {
		
		RestAssured.baseURI = "http://64.227.160.186:8080";
		RequestSpecification x =  RestAssured.given();
		RequestSpecification y = x.header("Content-type","application/json");
		RequestSpecification z = y.body("{\r\n"
				+ "			\"username\": \"sami5671\",\r\n"
				+ "			\"password\": \"sami123\"\r\n"
				+ "		}");
		
		Response response = z.post("/api/auth/login");
		
		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
}
