package com.connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementDemo {


	static Connection con = null;
	Statement st;
	ResultSet rs;
	
	CallableStatement cst;

	static Scanner sc = new Scanner(System.in);

	
	
	public CallableStatementDemo() {
		con = DBConnect.getconnect();
		System.out.println("Connection Established...");

		try {
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}


	public void callFunction() {
		
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		try {
			cst = con.prepareCall("{?= call oddeven(?) }");
			cst.registerOutParameter(1, Types.VARCHAR);
			cst.setInt(2, num);
			
			boolean status =cst.execute();
			
			if(!status) {
			System.out.println("The number "+num+" is: "+cst.getString(1));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		
		CallableStatementDemo obj = new CallableStatementDemo();
		
		obj.callFunction();
	
	}

}
