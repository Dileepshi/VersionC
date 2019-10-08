package com.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import com.files.Common_functions;
import com.files.Payload;
import com.files.Readconfig;
import com.files.Resources;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Basics3Json {
	
	Readconfig config = new Readconfig();
	String url = config.getUrl();
	String keyvalue = config.getKey();
	
	@Test
	public void addanddelete(){
		
       // 1. This is to grab the response
		RestAssured.baseURI = url;
		Response res=given().
		queryParam("key",keyvalue).
		body(Payload.postJsonData()).
		when().
		post(Resources.getAddresourcejson()).
		then().statusCode(200).assertThat().contentType(ContentType.JSON).
		body("status",equalTo("OK")).extract().response();
		
		//2.Grab the place id from the response
		JsonPath jp=Common_functions.rawToJSON(res);
		String Place_id =jp.get("place_id");
		System.out.println(Place_id);
		
		//3.Place this place id into delete request
		given().
		queryParam("key",keyvalue).
		body(Payload.deleteData(Place_id)).
		when().
		post(Resources.getdeleteresourcejson()).
		then().assertThat().statusCode(200).contentType(ContentType.JSON).and().
		body("status",equalTo("OK"));
		
     }
	}


