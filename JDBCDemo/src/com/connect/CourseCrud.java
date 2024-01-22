package com.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseCrud {

	static Connection con = null;
	Statement st;
	ResultSet rs;
	static PreparedStatement pst;

	static Scanner sc = new Scanner(System.in);

	CourseCrud() {

		con = DBConnect.getconnect();
		System.out.println("Connection Established...");

		try {
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void fetchCourseDetails() {

		try {
			rs = st.executeQuery("select * from course");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getFloat(4)
						+ " " + rs.getInt(5));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void deleteCourseById() {

		System.out.println("Enter the courseid to be deleted: ");
		int id = sc.nextInt();

		try {
			int noOfRowsDeleted = st.executeUpdate("delete from course where courseid=" + id);

			if (noOfRowsDeleted > 0) {
				System.out.println("Course " + id + " is deleted");
				fetchCourseDetails();
			} else {
				System.out.println("Course not present..");
			}

		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void deleteCourseByIdPS() {

		System.out.println("Enter the courseid to be deleted: ");
		int id = sc.nextInt();

		try {
			pst = con.prepareStatement("delete from course where courseid=?");

			pst.setInt(1, id);

			int noOfRowsDeleted = pst.executeUpdate();

			if (noOfRowsDeleted > 0) {
				System.out.println("Course " + id + " is deleted");
				fetchCourseDetails();
			} else {
				System.out.println("Course not present..");
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
			pst = con.prepareStatement("insert into course values(?, ?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, cname);
			pst.setInt(3, dur);
			pst.setFloat(4, fees);
			pst.setInt(5, 0);

			int noOfRowsInserted = pst.executeUpdate();
			if (noOfRowsInserted > 0) {

				System.out.println("Course Added...");
			} else {
				System.out.println("Error in adding the course...");
			}

		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public boolean searchCourseByid(int id) {

		boolean isFound = false;

		try {
			pst = con.prepareStatement("select * from course where courseid=?");
			pst.setInt(1, id);

			rs = pst.executeQuery();
			while (rs.next()) {

				isFound = true;
				System.out.println("Course id: " + rs.getInt(1));
				System.out.println("Course Name: " + rs.getString(2));
				System.out.println("Duration: " + rs.getInt(3));
				System.out.println("Fees: " + rs.getFloat(4));
				System.out.println("Number of Students: " + rs.getInt(5));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return isFound;
	}

	public void updateCourseFees() {

		System.out.println("Enter course id whose fees is to update: ");
		int id = sc.nextInt();

		if (searchCourseByid(id)) {
			System.out.println("Enter new Fees: ");
			float fees = sc.nextFloat();

			try {
				pst = con.prepareStatement("update course set fees=? where courseid=?");
				pst.setFloat(1, fees);
				pst.setInt(2, id);

				int noOfRowsUpdated = pst.executeUpdate();
				if (noOfRowsUpdated > 0) {
					System.out.println("Course fees updated");
					searchCourseByid(id);
				} else {
					System.out.println("Error in updating course..");
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void deleteCourseByName() {
		System.out.println("Enter the course Name to be deleted: ");
		String cname = sc.next();

		try {
			pst = con.prepareStatement("delete from course where cname = ?");
			pst.setString(1, cname);

			int rowsAffected = pst.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Course deleted successfully.");
			} else {
				System.out.println("Course not found with the given name: " + cname);
			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		CourseCrud obj = new CourseCrud();

		obj.fetchCourseDetails();
		System.out.println("------------------------------");

		// obj.deleteCourseById();

		int choice;
		char ch;

		do {
			System.out.println("-----Corse Cuud-----");
			System.out.println("----------------------------");
			System.out.println("1. Add new course");
			System.out.println("2. Delete course");
			System.out.println("3. Update Course Fees");
			System.out.println("4. View all courses");
			System.out.println("5. View Course By Id");
			System.out.println("6. Exit");
			System.out.println("7. Delete course (PS)");
			System.out.println("8. Delete course by Name");
			
			System.out.println("----------------------------");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				obj.insertCourse();
				break;

			case 2:
				obj.deleteCourseById();
				break;
			case 3:
				obj.updateCourseFees();
				break;
			case 4:
				obj.fetchCourseDetails();
				break;
			case 5:
				System.out.println("Enter the course id to be searched: ");
				int id = sc.nextInt();
				boolean isPresent = obj.searchCourseByid(id);
				if (!isPresent) {
					System.out.println("Course not found...");
				}
				break;

			case 6:
				System.out.println("___Closing the course Application___");
				System.exit(0);
				break;
			case 7:
				obj.deleteCourseByIdPS();
				break;
				
			case 8:
				obj.deleteCourseByName();
				break;
			default:
				System.out.println("Wrong Input");
			}

			System.out.println("Do you want to Continue ?");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
