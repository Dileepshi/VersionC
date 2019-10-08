package com.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

import com.files.Common_functions;
import com.files.Readconfig;
import com.files.Resources;

public class ExtractJson {

	Readconfig config = new Readconfig();
	String url =config.getUrl();
	String keyvalue = config.getKey();

	@Test
	public void basictest() {

		RestAssured.baseURI = "https://maps.googleapis.com";
		Response res=given().
		param("location", "-33.8670522,151.1957362").
		param("radius", "1500").
		param("key", "AIzaSyBc-MlpqbxQt1koNpp_z67LX9tyDUxIAvk").log().all().
		when().
		get(Resources.getdata()).
		then().
		assertThat().statusCode(200).and().contentType(ContentType.JSON).
		body("results[0].name", equalTo("Sydney")).
		body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).and().
		header("server", "scaffolding on HTTPServer2").log().body().
		extract().response();
		JsonPath js=Common_functions.rawToJSON(res);
		
		// here results is an object which has to be considered as an array. SO to get the size of an array
		int count =js.get("results.size()");
		
		for(int i=0;i<count;i++){
			
			String name =js.get("results["+i+"].name");
			System.out.println(name);
		}
		
	}

	// here you check the assertions like - status code, content type,body ,
	// header ....

}
