package com.assignment3;

import java.util.Scanner;

//1. Write a Java program to check whether a year is leap year or not 

// a year is a leap year if it is divisible by 4 but not divisible by 100, or if it is divisible by 400.

public class LeapYearValidation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a year");

		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + " is leap year");

		} else {
			System.out.println(year + " is not leap year");
		}
		sc.close();

	}

}
