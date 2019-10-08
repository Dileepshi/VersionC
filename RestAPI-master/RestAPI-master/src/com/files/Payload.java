package com.files;

public class Payload {
	
	public static String postJsonData() {

		String jsonData = "{"+

    "\"location\":{"+

        "\"lat\" : -38.383494,"+

        "\"lng\" : 33.427362"+

    "},"+

	"\"accuracy\":50,"+

	"\"name\":\"Frontline house\","+

	"\"phone_number\":\"(+91) 983 893 3937\","+

	"\"address\" : \"29, side layout, cohen 09\","+

	"\"types\": [\"shoe park\",\"shop\"],"+

	"\"website\" : \"http://google.com\","+

	"\"language\":\"French-IN\""+

"}";

		return jsonData;
	}
	
	public static String deleteData(String Place_id){
		
		String delData="{"+
				"\"place_id\":\""+Place_id+"\""+
				"}";
		
		return delData;
	}
	
	public static String addbook(String isbnid,String aisleid){
		
		String addjson="{\r\n\r\n\"name\":\"Learn Appium Automation with Java\",\r\n\"isbn\":\""+isbnid+"\",\r\n\"aisle\":\""+aisleid+"\",\r\n\"author\":\"dilss\"\r\n\r\n}";
		
		return addjson;
	}

}
