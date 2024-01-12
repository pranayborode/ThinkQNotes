package com.ifelse;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first no :");
		int num1 = sc.nextInt();

		System.out.println("Enter second no :");
		int num2 = sc.nextInt();

		sc.close();

		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else {
			System.out.println(num2 + " is greater than " + num1);
		}

	}

}
