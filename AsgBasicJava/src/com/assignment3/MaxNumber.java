package com.assignment3;

import java.util.Scanner;

//3. Write a Java program to find maximum between three numbers 

public class MaxNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers :");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + " is greatest");
			} else {
				System.out.println(num3 + " is greatest");
			}
		} else {
			if (num2 > num3) {
				System.out.println(num2 + " is greatest");
			} else {
				System.out.println(num3 + " is greatest");
			}
		}
		sc.close();

	}

}
