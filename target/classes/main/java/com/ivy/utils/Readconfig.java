package com.ivy.utils;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class Readconfig {

	Properties po;

	public Readconfig() {

		try {
			File fil = new File("C:\\Users\\dileep.ks\\workspace\\IvyProjects\\Configurations\\config.properties");
			FileInputStream input = new FileInputStream(fil);
			po = new Properties();
			po.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getBaseurl() {

		String baseurl = po.getProperty("url");
		return baseurl;

	}

	public String getUsername() {

		String username = po.getProperty("username");
		return username;

	}

	public String getPassword() {

		String password = po.getProperty("password");
		return password;

	}

	public String getBrowsername() {

		String browserName = po.getProperty("browserName");
		return browserName;

	}
	public String getlocationDataPath() {

		String locationdata_path = po.getProperty("locationdata_path");
		return locationdata_path;

	}
	public String getlocationDatasheetname() {

		String locationSheetname = po.getProperty("locationSheetname");
		return locationSheetname;

	}
}
