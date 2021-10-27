package com.apiTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiTest {
	@Test
	public void authenticationBasic() {

		RestAssured.baseURI = "https://restapi.demoqa.com/authentication/CheckForAuthentication/";
		RequestSpecification request = RestAssured.given();
		Response response=request.get();
		System.out.println(response.getStatusCode());
		System.out.println(response.body().toString());
	}

}
