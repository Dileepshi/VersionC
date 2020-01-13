package JnJMaster_TestCases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getWarehouseStock {
	
	@Test
	public void getStock() {
		
		
		RestAssured.baseURI = "https://jnj-ae-qa.ivycpg.com/webapi_interface/";
		
		Response res=RestAssured.given()
		.header("Content-Type",	"application/json")
		.header("security_token_key",TC_GetSecutityToken.getSecutityToken())
		.body("{\r\n" + 
				"    \"WarehouseStockMaster\":[\r\n" + 
				"        {\r\n" + 
				"            \"Branch_Code\":\"\",\r\n" + 
				"            \"Stock_Date\":\"24/10/2019\",\r\n" + 
				"            \"Product_Code\":\"\",\r\n" + 
				"            \"UOM\":\"\",\r\n" + 
				"            \"Stock_Qty\":\"\"\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"}")
		.post("api/WarehouseStock/Master");
		
		System.out.println(res.getBody().jsonPath().prettify());
		
		
	}

}
