package com.Lab1;

import java.util.Scanner;

public class NumberValidation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		
		if (a == b && b == c) {
			System.out.println("Given three numbers are equal : " + a + " = " + b + " = " + c);
		} else if (a == b) {
			System.out.println("Given two numbers are equal : " + a + " = " + b);
		} else if (b == c) {
			System.out.println("Given two numbers are equal : " + b + " = " + c);
		} else if (a == c) {
			System.out.println("Given two numbers are equal : " + a + " = " + c);
		} else {
			System.out.println("All the three numbers are not equal");
		}

	}

}
