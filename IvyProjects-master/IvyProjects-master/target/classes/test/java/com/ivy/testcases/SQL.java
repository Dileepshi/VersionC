package com.ivy.testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.ArrayList;

import org.testng.annotations.Test;

public class SQL {
	
	
	@Test
	public void sql() throws Exception {
		
		String host ="localhost";
	    String port ="3306";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/sakila","root","dileep");
		
		Statement s=con.createStatement();
		ResultSet r=s.executeQuery("select * from actor;");
		//ArrayList<String> alldata = new ArrayList<String>();
		
		while(r.next()) {
			String code=r.getString("last_name");
		//alldata.add(r.getString("last_name"));
		//System.out.println(code);
			System.out.println(code);

		}
		
	}

}
