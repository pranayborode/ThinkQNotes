package com.connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetCrud {

	static Connection con = null;
	Statement st;
	ResultSet rs;

	static Scanner sc = new Scanner(System.in);

	public ResultSetCrud() {
		con = DBConnect.getconnect();

		try {
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select*from course");

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void fetchAllCourse() {

		try {
			
			rs.beforeFirst();// take cursor before first row
			//rs.afterLast();
			//rs = st.executeQuery("select*from course");
			while (rs.next()) {
//			while(rs.previous()) {	
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getFloat(4));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}

	}
	
	public void insertCourse() {
		
		System.out.println("Enter course id: ");
		int id = sc.nextInt();

		System.out.println("Enter course name: ");
		String cname = sc.next();

		System.out.println("Enter duration (in months):");
		int dur = sc.nextInt();

		System.out.println("Enter fees: ");
		float fees = sc.nextFloat();
		

		try {
			rs.moveToInsertRow();
			
			rs.updateInt(1, id);
			rs.updateString(2, cname);
			rs.updateInt(3, dur);
			rs.updateFloat(4, fees);
			rs.updateInt(5, 0);
			
			rs.insertRow();
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	
	public void deleteCourseById() {
		
		System.out.println("Enter the courseid to be deleted:");
		int id = sc.nextInt();
		
		try {
			rs.beforeFirst();
			while(rs.next()) {
				
				if(rs.getInt(1)==id) {
					rs.deleteRow();
				}
			}
			
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public void updateCourseFees() {
		
		System.out.println("Enter course Name whose fees is to update: ");
		String cname =  sc.next();
		
		
		
		try {
			rs.beforeFirst();
			
			while(rs.next()) {
				
				if(rs.getString(2).equalsIgnoreCase(cname)) {
					
					System.out.println("Old fees: "+rs.getFloat(4));
					System.out.println("Enter the new Fees");
					float fees =  sc.nextFloat();
					
					rs.updateFloat(4, fees);
					rs.updateRow();
				}
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {

		ResultSetCrud obj = new ResultSetCrud();

		int choice;
		char ch;

		do {
			System.out.println("====Course CRUD====");
			System.out.println("1. Add new Course");
			System.out.println("2. Delete Course by Id");
			System.out.println("3. Update course fees");
			System.out.println("4. View all course");
			System.out.println("5. View course by id");
			System.out.println("6. Delete Course By Name");
			System.out.println("7. Exit");

			System.out.println("\nEnter your choice");
			System.out.println("---------------");

			choice = sc.nextInt();
			switch (choice) {
				case 1 : obj.insertCourse();
						break;
				case 2 : obj.deleteCourseById();
						break;
				case 3 : obj.updateCourseFees();
						break;
			case 4:
				obj.fetchAllCourse();
				break;
//				case 5 : System.out.println("Enter the course Id to be searched :" );
//						int id = sc.nextInt();
//						boolean isPresent = obj.searchCourseById(id);
//						if(!isPresent) {
//							System.out.println("Course not found...");
//						}
//						break;
//						
//				case 6 : obj.deleteCourseByName();
//						break;
			case 7:
				System.out.println("----closing the course application----");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input ...");
			}
			System.out.println("do you want to perform opeation (y-yes/n-no)");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
