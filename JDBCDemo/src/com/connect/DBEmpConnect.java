package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBEmpConnect {
	
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/testcoursedb";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";
	
	static Connection con = null;
	public static Connection getconnect() {
		
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver loaded...");
			
			con = DriverManager.getConnection (JDBC_URL, USERNAME, PASSWORD);
			//System.out.println("Connection Established...");
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return con;
	}
	

	public static void main(String[] args) {
		
		getconnect();

	}

}
