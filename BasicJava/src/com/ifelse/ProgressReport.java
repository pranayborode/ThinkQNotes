package com.ifelse;

import java.util.Scanner;

public class ProgressReport {

	public static void main(String[] args) {

		float sub1, sub2, sub3, sub4, sub5;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name :");

		String userName = sc.next();

		System.out.println("Enter Marks of 5 Subjects :");

		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
		sub4 = sc.nextInt();
		sub5 = sc.nextInt();

		double perc = ((sub1 + sub2 + sub3 + sub4 + sub5) * 100) / 500;
		System.out.println(userName + "scored " + perc + " %");

		if (perc >= 40) {
			System.out.println(userName + " has cleared the exam with " + perc + " %");
		} else {
			System.out.println(userName + " has not cleared the exam scored " + perc + " %");
		}
		sc.close();
	}

}
