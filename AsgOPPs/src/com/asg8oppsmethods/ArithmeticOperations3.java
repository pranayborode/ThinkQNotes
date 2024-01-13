package com.asg8oppsmethods;

import java.util.Scanner;

//10) Write java Program for arithmetic operation for each operation write separate Method using 
//    parameter Passing and return type


public class ArithmeticOperations3 {

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public double div(int num1, int num2) {

		if (num2 != 0) {
			return num1 / num2;
		} else {
			System.out.println("Can't divide by zero");
			return 0.0;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArithmeticOperations3 a3 = new ArithmeticOperations3();

		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();

		System.out.println(num1 + " + " + num2 + " = " + a3.add(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + a3.subtract(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + a3.multiply(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + a3.div(num1, num2));
		sc.close();

	}

}
