package com.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

import com.files.Readconfig;
import com.files.Resources;

public class Basics {

	/*Readconfig config = new Readconfig();
	String url =config.getUrl();
	String keyvalue = config.getKey();
*/
	@Test
	public void basictest() {

		RestAssured.baseURI = "https://maps.googleapis.com";
		given().param("location", "-33.8670522,151.1957362").param("radius", "1500")
				.param("key", "AIzaSyBc-MlpqbxQt1koNpp_z67LX9tyDUxIAvk").
				when().
				get(Resources.getdata()).
				then().
				assertThat().statusCode(200).and().contentType(ContentType.JSON).
				body("results[0].name", equalTo("Sydney")).
				body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).and().
				header("server", "scaffolding on HTTPServer2");
	}

	// here you check the assertions like - status code, content type,body ,
	// header ....

}
