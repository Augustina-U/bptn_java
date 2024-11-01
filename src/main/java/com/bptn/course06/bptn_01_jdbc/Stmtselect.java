package com.bptn.course06.bptn_01_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Result {

	public static void main(String[] args) {
	 String dbURL = "jdbc:postgresql://localhost:5432/bptn";
	 String dbUsername = "postgres";
	 String dbPassword = "pg123";
	 String sql = "Select * FROM students ORDER BY \"studentName\"";
	 
	 try (Connection con = DriverManager.getConnection(dbURL, dbPassword, dbUsername);
	          Statement st = con.createStatement();
			  ResultSet rs = st.executeQuery(sql);)
	     
	} catch (SQLException e) {
		e.printStackTrace();
	}
	 }

	
