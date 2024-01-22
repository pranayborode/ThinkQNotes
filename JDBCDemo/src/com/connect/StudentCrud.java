package com.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentCrud {

	static Connection con = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;

	static Scanner sc = new Scanner(System.in);
    
	SimpleDateFormat dateInput = new SimpleDateFormat("yyyy-mm-dd");
	
	StudentCrud() {

		con = DBConnect.getconnect();
		System.out.println("Connection Established...");

		try {
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}
	
	public void addNewStudent() throws ParseException {
		
		System.out.println("Enter Student Id");
		int sid = sc.nextInt();
		
		System.out.println("Enter Student Name");
		String name = sc.next();
		
		System.out.println("Enter Email");
		String email = sc.next();
		
		System.out.println("Enter Phone No");
		long phoneNo = sc.nextLong(); 
		
		System.out.println("Enter Course Id");
		int cid = sc.nextInt();

		System.out.println("Enter Fees Status");
		float feesStatus = sc.nextFloat();
		
		System.out.println("Enter Joining Date: (yyyy-mm-dd)");
		String jdate = sc.next();
//		try {
//			
//			java.util.Date jd = dateInput.parse(jdate);
//			
//		} catch (ParseException e) {
//			System.out.println(e);
//		}
		Date jd = dateInput.parse(jdate);
		java.sql.Date jds=new java.sql.Date(jd.getTime());
		
		try {
			pst = con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
			
			pst.setInt(1, sid);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setLong(4, phoneNo);
			pst.setInt(5, cid);
			pst.setFloat(6, feesStatus);
			pst.setDate(7, jds);
			
			int noOfRowsInserted = pst.executeUpdate();
			if (noOfRowsInserted > 0) {

				System.out.println("Student Added...");
			} else {
				System.out.println("Error in adding the Student...");
			}

			
		} catch (SQLException e) {
			System.out.println(e);
		}
		 		
	}

	public void fetchStudentDetails() {

		try {
			rs = st.executeQuery("select * from student");

			while (rs.next()) {

				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getLong(4)
						+ " " + rs.getInt(5) + " " + rs.getString(6) + " " + rs.getDate(7));
			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void deleteStudentByid() {

		System.out.println("Enter the studentid to be deleted: ");
		int id = sc.nextInt();

		try {
			int noOfRowsDeleted = st.executeUpdate("delete from student where stid=" + id);

			if (noOfRowsDeleted > 0) {
				System.out.println("Student " + id + " is deleted...");
				fetchStudentDetails();
			} else {
				System.out.println("Student not present...");
			}

		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws ParseException {

		StudentCrud obj = new StudentCrud();
		obj.fetchStudentDetails();

		obj.deleteStudentByid();

		int choice;
		char ch;

		do {
			System.out.println("-----Corse Cuud-----");
			System.out.println("----------------------------");
			System.out.println("1. Add new Student");
			System.out.println("2. Delete Student by Id");
			System.out.println("3. Update Student FeesStatus");
			System.out.println("4. View all Student");
			System.out.println("5. View Student By Id");
			System.out.println("6. Exit");
			System.out.println("----------------------------");

			choice = sc.nextInt();

			switch (choice) {
			 case 1: obj.addNewStudent();
			 break;
			case 2:
				obj.deleteStudentByid();
				break;
//			case 3: obj.updateStudentFeesStatus();
//			       break;
			case 4:
				obj.fetchStudentDetails();
				break;
//			case 5: obj.viewStudentById();
//			       break;
			case 6:
				System.out.println("___Closing the Student Application___");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Input");
			}

			System.out.println("Do you want to Continue ?");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
