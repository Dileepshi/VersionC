package com.guru.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;

	public Readconfig() {

		try {

			File fil = new File("./Configurations/config.properties");
			FileInputStream fis = new FileInputStream(fil);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String getURL() {

		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getusername() {

		String user = pro.getProperty("UN");
		return user;
	}

	public String getpassword() {

		String pass = pro.getProperty("PW");
		return pass;
	}

	public String getfirebrowserpath() {

		String firefox = pro.getProperty("firefoxpath");
		return firefox;
	}

}
