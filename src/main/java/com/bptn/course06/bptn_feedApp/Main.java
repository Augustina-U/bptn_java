package com.bptn.course06.bptn_feedApp;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
        FeedAppClass jdbc = new FeedAppClass(); // Create an instance of FeedAppClass
        Connection conn = jdbc.createConnection(); // Establish a database connection

        // Call the addUser method to insert a new user
        jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);

        // Close the database connection
        jdbc.closeConnection(conn);
    }
}