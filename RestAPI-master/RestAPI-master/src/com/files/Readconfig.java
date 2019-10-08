package com.files;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;

	public Readconfig() {

		try {

			File fil = new File("C:\\Users\\dileep.ks\\workspace\\RestAPI\\src\\com\\files\\Config.properties");
			FileInputStream fis = new FileInputStream(fil);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String getUrl() {

		String baseURL = pro.getProperty("baseURL");
		return baseURL;
	}
	public String getKey() {

		String key = pro.getProperty("key");
		return key;
	}

}
