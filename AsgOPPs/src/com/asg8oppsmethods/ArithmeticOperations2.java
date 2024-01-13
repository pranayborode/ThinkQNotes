package com.asg8oppsmethods;

import java.util.Scanner;

//9) Write java Program for arithmetic operation for each operation write separate Method using 
//parameter Passing


public class ArithmeticOperations2 {

	public void addition(int num1, int num2) {
		System.out.println("Addition : "+(num1 + num2));
	}

	public void subtract(int num1, int num2) {
		System.out.println("Subtract : "+(num1 - num2));
	}

	public void multiply(int num1, int num2) {
		System.out.println("Multiply : "+(num1 * num2));
	}

	public void divide(int num1, int num2) {

		if (num2 != 0) {
			System.out.println("Division : "+(num1 / num2));
		} else {
			System.out.println("Can't divide by zero");
			System.out.println("Can't divide by zero");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArithmeticOperations2 a2 = new ArithmeticOperations2();

		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();

		
		a2.addition(num1,num2);
		a2.subtract(num1,num2);
		a2.multiply(num1,num2);
		a2.divide(num1,num2);
		
		sc.close();

	}

}
