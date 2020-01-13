package JnJMaster_TestCases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import JnJMaster_Utils.ReadData;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SalesReturn {

	@Test(dataProvider = "ExcelData", dataProviderClass = ReadData.class)
	public void insertSalesReturn(String Branch_Code, String Retailer_Code, String User_Code, String Return_No,
			String Invoice_No, String Return_Date, String SKU_Code, String UOM, String Reason, String Return_Qty,
			String SKU_Price, String Line_Value, String Total_Amount, String Doc_category) {

		RestAssured.baseURI = "https://jnj-ae-qa.ivycpg.com/webapi_interface/";
		try {
			// Create Json object for all values
			JSONObject object = new JSONObject();
			// Create Json object to pass header
			JSONObject headerobject = new JSONObject();
			int branchCode = (int) Double.parseDouble(Branch_Code);
			object.put("Branch_Code", branchCode);
			object.put("Retailer_Code", (int) Double.parseDouble(Retailer_Code));
			object.put("User_Code", (int) Double.parseDouble(User_Code));
			object.put("Return_No", Return_No);
			object.put("Invoice_No", Invoice_No);
			object.put("Return_Date", Return_Date);
			object.put("SKU_Code", SKU_Code);
			object.put("UOM", UOM);
			object.put("Reason", Reason);
			object.put("Return_Qty", Return_Qty);
			object.put("SKU_Price", SKU_Price);
			object.put("Line_Value", Line_Value);
			object.put("Total_Amount", Total_Amount);
			object.put("Doc_category", Doc_category);

			// Create JsonParser object to convert json object to stream form
			JsonParser jsonParser = new JsonParser();

			// create JsonArray to put objects in an array
			JsonArray array = new JsonArray();
			array.add(jsonParser.parse(object.toJSONString()));
			headerobject.put("salesReturnMaster", array.getAsJsonArray());

			Response res = RestAssured.given()
					.header("security_token_key", TC_GetSecutityToken.getSecutityToken())
					.header("Content-Type", "application/json")
					.body(headerobject.toJSONString())
					.post("api/SalesReturn/Master");

			//System.out.println(res.getBody().jsonPath().prettify());
			System.out.println(res.jsonPath().get("ErrorLog"));
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
