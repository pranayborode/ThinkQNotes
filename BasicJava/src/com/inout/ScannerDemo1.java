package com.inout;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rollno;
		String name;
		double marks;
		char grade;

		System.out.println("Enter Your RollNo :");
		rollno = sc.nextInt();

		System.out.println("Enter Your Name :");
		name = sc.next();

		System.out.println("Enter Marks");
		marks = sc.nextDouble();

		System.out.println("Enter Grade");
		grade = sc.next().charAt(0);
		sc.close();
		
		System.out.println("-------------------------");

		System.out.println("Roll No : " + rollno + " Name : " + name);
		System.out.println("You have scored " + marks + " Marks with grade " + grade);

	}

}
