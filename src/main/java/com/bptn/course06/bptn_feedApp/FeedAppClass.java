package com.bptn.course06.bptn_feedApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedAppClass {

	
		private static final String username = "postgres";
		private static final String password = "pg123";
		private static final String dbName = "postgres";
		private static final String port = "5432";
		private static final String dbUrl = "jdbc:postgresql://localhost:5432/feedApp";

		public Connection createConnection() { 
			Connection conn = null;
			try {
				conn = DriverManager.getConnection (dbUrl, username, password);
				System.out.println("Opened database successfully");
			} catch (SQLException e) {
	            System.out.println(e.getClass().getName() + ": " + e.getMessage());
	            System.exit(0);
	        }
			 return conn;
			 }
	    
		
		 // Method to add a new user to the User table
	    public void addUser(Connection conn, String firstName, String lastName, String username, 
	                        String phone, String emailId, String password, boolean emailVerified) {
	        PreparedStatement stmt = null;
	        try {
	            String sql = "INSERT INTO \"User\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
	            stmt = conn.prepareStatement(sql);
	            
	            
	            
	            // Setting the values in the prepared statement
	            stmt.setString(1, firstName);
	            stmt.setString(2, lastName);
	            stmt.setString(3, username);
	            stmt.setString(4, phone);
	            stmt.setString(5, emailId);
	            stmt.setString(6, password);
	            stmt.setBoolean(7, emailVerified);
	            
	            // Executing the statement and getting the result count
	            int resultCount = stmt.executeUpdate();
	            System.out.println(resultCount + " record(s) inserted");
	        } catch (SQLException ex) {
	            System.out.println("Exception: " + ex.getMessage());
	        } finally {
	            try {
	                if (stmt != null) {
	                    stmt.close(); // Closing the prepared statement
	                }
	            } catch (SQLException e) {
	                System.out.println("Exception: " + e.getMessage());
	            }
	        }
	    }

	    // Method to close the database connection
	    public boolean closeConnection(Connection conn) {
	        boolean flag = true;
	        try {
	            if (conn != null) {
	                conn.close(); // Closing the connection
	            }
	        } catch (SQLException ex) {
	            flag = false;
	            System.out.println("Exception: " + ex.getMessage());
	        }
	        return flag;
	    }
	}
		
	
