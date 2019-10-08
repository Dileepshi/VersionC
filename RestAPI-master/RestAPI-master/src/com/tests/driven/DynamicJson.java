package com.tests.driven;

import static io.restassured.RestAssured.given;

import java.nio.file.Files;
import java.nio.file.Paths;
import org.testng.annotations.Test;
import com.files.Common_functions;
import com.files.Resources;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DynamicJson {
	
	@Test
	public void addBook() throws Exception{
		
      RestAssured.baseURI = "http://216.10.245.166";
		Response res=given().
				header("Content-Type","application/json").
		body(Generatestringfromresource("D:\\Automation\\RestAPI-Assured Jars\\addBook.json")).
		when().
		post(Resources.getaddbook()).
		then().statusCode(200).assertThat().
	    extract().response();
		
		JsonPath jp=Common_functions.rawToJSON(res);
		String id =jp.get("ID");
		String message =jp.get("Msg");
		System.out.print(id);
		System.out.print(message);
	   
}
	
	// this method is used to read the file and pass into as string
	public static String Generatestringfromresource(String path) throws Exception{
		
		return new String(Files.readAllBytes(Paths.get(path)));
		
	}
}


