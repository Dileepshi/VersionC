package com.tests;

import org.testng.annotations.Test;

import com.files.Payload;
import com.files.Readconfig;

import static io.restassured.RestAssured.given;	

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;

public class Basics2 {

	// path parameters are not allowed in post requests

	// this is query parameter
	
	Readconfig config = new Readconfig();
	String url = config.getUrl();
	String keyvalue = config.getKey();

	@Test
	public void postdata() {

		RestAssured.baseURI = url;
		given().
		queryParam("key",keyvalue).
		body(Payload.postJsonData()).
		when().
		post("maps/api/place/add/json").
		then().statusCode(200).assertThat().contentType(ContentType.JSON).body("status",equalTo("OK"));

}

}
