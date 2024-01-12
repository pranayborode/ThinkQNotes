package com.inout;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		float num1, num2, num3, average;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first no :");
		num1 = sc.nextFloat();

		System.out.println("Enter second no :");
		num2 = sc.nextFloat();

		System.out.println("Enter third no :");
		num3 = sc.nextFloat();

		average = (num1 + num2 + num3) / 3;

		sc.close();

		System.out.println("------------------------");
		
		System.out.println("Average of given three Numbers is "+average);

	}

}
