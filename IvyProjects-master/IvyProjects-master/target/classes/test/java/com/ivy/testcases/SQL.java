package com.ivy.testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class SQL {
	
	
	@Test
	public void sql() throws Exception {
		
		String host ="IVYQADBAWSIN01";
	    String port ="1433";
		
		Connection con=DriverManager.getConnection("jdbc:sqlserver://"+ host +":"+ port +"/IvyCpg_DiageoGhana","IvyCpg_DiageoGhana_QAuser","IvyCpg_DiageoGhana_QAuserpwd123");
		Statement s=con.createStatement();
		ResultSet r=s.executeQuery("select * from sadm_users where su_id=1851");
		r.next();
		String code=r.getString("SU_User_code");
		System.out.println(code);
		
		
	}

}
