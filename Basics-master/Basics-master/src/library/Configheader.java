package library;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configheader {

	Properties pro;

	public Configheader() {

		try {
			File src = new File("./Configuration/Config.Property");
			FileInputStream Fil = new FileInputStream(src);
			pro = new Properties();
			pro.load(Fil);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getfirepath() {
		String Firepath = pro.getProperty("FirefoxDriver");
		return Firepath;
	}

	public String applicationURL() {
		String URL = pro.getProperty("URL");
		return URL;
	}
}
