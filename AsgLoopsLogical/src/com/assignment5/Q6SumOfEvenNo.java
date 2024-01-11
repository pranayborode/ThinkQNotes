package com.assignment5;

import java.util.Scanner;

//6.Write a Java program to find sum of all even numbers between 1 to n. 

public class Q6SumOfEvenNo {

	public static int evenNum(int num) {

		int sum = 0;
		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0) {
				sum += i;

			}

		}
		return sum;

	}

	public static void main(String[] args) {

		System.out.println("enter Number");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println("sum of even number is " + evenNum(n));

	}
}
