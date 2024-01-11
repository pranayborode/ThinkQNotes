package com.assignment5;

import java.util.Scanner;

//7.Write a Java program to find sum of all odd numbers between 1 to n.

public class Q7SumOFOddNumbers {

	public static int oddNum(int num) {

		int sum = 0;
		for (int i = 1; i <= num; i++) {

			if (i % 2 != 0) {
				sum += i;

			}
		}
		return sum;

	}

	public static void main(String[] args) {

		System.out.println("enter Number");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println("sum of odd number is " + oddNum(n));

	}

}
