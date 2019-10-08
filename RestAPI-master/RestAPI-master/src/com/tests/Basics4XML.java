package com.tests;

import static io.restassured.RestAssured.given;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.testng.annotations.Test;

import com.files.Common_functions;
import com.files.Readconfig;
import com.files.Resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class Basics4XML {
	
	Readconfig config = new Readconfig();
	String url = config.getUrl();
	String keyvalue = config.getKey();
	
	@Test
	public void addanddelete() throws Exception{
		
		String postdata=Generatestringfromresource("D:\\Automation\\RestAPI-Assured Jars\\Postdatafile.XML");
		RestAssured.baseURI = url;
	    Response res=given().
	    		//any thing after question mark is query param
		queryParam("key",keyvalue).
		body(postdata).
		when().
		post(Resources.getAddresourcexml()).
		then().statusCode(200).assertThat().contentType(ContentType.XML).
		extract().response();
	    
	    // this is to convert Raw data into String
	    XmlPath xp =Common_functions.rawToXML(res);
	    String status =xp.get("response.status");
	    String place_ID =xp.get("response.place_id");
	    System.out.println(status);
	    System.out.println(place_ID);
	    
	   }
	// this method is used to convert XML data to string
	public static String Generatestringfromresource(String path) throws Exception{
		
		return new String(Files.readAllBytes(Paths.get(path)));
		
	}
}


