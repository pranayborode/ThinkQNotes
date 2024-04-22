package com.lab15;

import java.util.Scanner;

public class PrintFactorial {

	static long calcFactorial(int s , int n) {

		long result = 1;
		for (int i = s; i <= n; i++) {

			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter starting No : ");
		int s = sc.nextInt();

		System.out.println("Enter End No : ");

		int n = sc.nextInt();

		long op = calcFactorial(s,n);

		System.out.println(op);

	}

}
