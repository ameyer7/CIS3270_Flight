package edu.java.flight;

import java.sql.*;

public class Test {
	
	public static void main(String[] args) 
		throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", 
				"CIS3270", "Cis3270");
		
		System.out.println("Database connected");
		
		
		
		
		
		
		
	}

}
