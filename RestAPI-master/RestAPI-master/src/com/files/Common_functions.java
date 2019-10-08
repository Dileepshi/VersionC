package com.files;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class Common_functions {

	public static XmlPath rawToXML(Response res) {

		String responseString = res.asString();
		XmlPath x = new XmlPath(responseString);

		return x;
	}

	public static JsonPath rawToJSON(Response res) {

		String responseString = res.asString();
		JsonPath x = new JsonPath(responseString);

		return x;
	}
}
