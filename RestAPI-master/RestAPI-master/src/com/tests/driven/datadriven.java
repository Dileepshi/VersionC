package com.tests.driven;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.files.Common_functions;
import com.files.Payload;
import com.files.Resources;

import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class datadriven {
	

	@Test(dataProvider="booksdata")
	public void addBook(String passid,String passname){
		
      
		RestAssured.baseURI = "http://216.10.245.166";
		Response res=given().
				header("Content-Type","application/json").
		body(Payload.addbook(passid,passname)).
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
	
	@DataProvider(name="booksdata")
	public Object[][] getdata(){
		
		//array is the collection of elements
		//multi dimensional array is collection of arrays
		Object [][] data = new Object [2][2];
		data[0][0]="abs";
		data[0][1]="249";
		
		data[1][0]="hdhd";
		data[1][1]="250";
		
		return data;
		
		// or this can be used
		//return new Object[][] {{"abcf","247"}, {"abcy","248"} };
		
	}
	}


