package com.asg8oppsmethods;

import java.util.Scanner;


//8)Write java Program for arithmetic operation for each operation write separate Method.

public class ArithmeticOperations1 {


	Scanner sc = new Scanner(System.in);

	public void addition() {
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Addition : "+(num1 + num2));
	}
	
	public void subtract() {
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Subtract : "+(num1 - num2));
	}
	
	public void multiply() {
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Multiply : "+(num1 * num2));
	}

	public void divide() {
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		if (num2 != 0) {
			System.out.println("Division : "+(num1 / num2));
		} else {
			System.out.println("Can't divide by zero");
			
		}
	}
	

	
	public static void main(String[] args) {
	
		ArithmeticOperations1 a1 = new ArithmeticOperations1();
		
		a1.addition();
		a1.subtract();
		a1.multiply();
		a1.divide();

	}

}
