package com.asg7opps;

import java.util.Scanner;

public class Student1Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 2; i++) {
			System.out.println("Enter Student Details");

			Q11Student1 s = new Q11Student1();

			System.out.println("Enter Roll Number :");
			s.setRollNo(sc.nextInt());

			System.out.println("Enter Name :");
			s.setStdName(sc.next());

			System.out.println("Enter Age");
			s.setAge(sc.nextInt());

			System.out.println("Student" + i + " Details");
			System.out.println("Roll Number : " + s.getRollNo());
			System.out.println("Name        : " + s.getStdName());
			System.out.println("Age         : " + s.getAge());
			System.out.println("-------------------------------");

		}
		sc.close();

	}

}
