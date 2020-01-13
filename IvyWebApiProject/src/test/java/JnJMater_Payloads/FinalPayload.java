package JnJMater_Payloads;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;


public class FinalPayload {
	
	@Test
	public void testload() throws JsonProcessingException {
		
		
		  JSONObject object= new JSONObject(); 
		  
		  object.put("Branch_Code", "1"); 
		  object.put("Retailer_Code", "3029"); 
		  object.put("User_Code", "16722"); 
		  object.put("Return_No", "SR13164613165"); 
		  object.put("Invoice_No", "INV146545646"); 
		  object.put("Return_Date", "10/28/2018"); 
		  object.put("SKU_Code", "GI24247170"); 
		  object.put("UOM", "EA"); 
		  object.put("Reason", "Damaged"); 
		  object.put("Return_Qty", "50"); 
		  object.put("SKU_Price", "14400"); 
		  object.put("Line_Value", "172800");
		  object.put("Total_Amount", "2344680");
		  object.put("Doc_category", "XYZ");
		  
		  JsonParser jsonParser =new JsonParser(); 
		  
		  JsonArray array= new JsonArray();
		  array.add(jsonParser.parse(object.toJSONString())); 
		  
		  JSONObject headerobject= new JSONObject();
		  headerobject.put("salesReturnMaster", array);
		 
		  
		  System.out.println(headerobject.toJSONString());
		  
		 
	
	}

}
