package JnJMaster_TestCases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_GetSecutityToken {

	@Test
	public static String getSecutityToken() {

		RestAssured.baseURI = "https://jnj-ae-qa.ivycpg.com/webapi_interface/";

		JSONObject ob = new JSONObject();
		ob.put("LoginId", "bilal");
		ob.put("Password", "password");

		Response Res = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.body(ob.toJSONString())
				.post("api/UserMaster/AuthenticateUser");

		String SecurityToken = null;

		if (Res.getStatusCode() == 200) {
			SecurityToken = Res.getHeader("SECURITY_TOKEN_KEY");
		}
		return SecurityToken;

	}

}
