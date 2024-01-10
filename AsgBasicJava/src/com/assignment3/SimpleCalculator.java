package com.assignment3;

import java.util.Scanner;

//5. Write a Java program to create Simple Calculator 

public class SimpleCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first no:");
		double num1 = sc.nextDouble();

		System.out.println("Enter operator");
		char operator = sc.next().charAt(0);

		System.out.println("Enter second no:");
		double num2 = sc.nextDouble();

		if (operator == '+') {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if (operator == '-') {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if (operator == '*') {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		} else if (operator == '/') {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		} else if (operator == '%') {
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		} else {
			System.out.println("Enter valid input");
		}
		sc.close();

	}
}
