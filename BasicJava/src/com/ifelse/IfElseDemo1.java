package com.ifelse;

import java.util.Scanner;

public class IfElseDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number :");

		int n = sc.nextInt();

		if (n >= 0)
			System.out.println(n + " is positive number.");
		else
			System.out.println(n + " is negative number.");

		sc.close();
		System.out.println("Program ends...");

	}

}
