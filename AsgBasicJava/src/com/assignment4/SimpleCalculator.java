package com.assignment4;

import java.util.Scanner;

//4. Write a Java program to create Simple Calculator using switch case Menu Driven 
public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter operation to perform +, -, *, /, % ");
		char opr = sc.next().charAt(0);
		
		System.out.println("Enter two numbers");
		double num1 = sc.nextInt();
		double num2 = sc.nextDouble();
		double result = 0;;
		
		switch(opr) {
		
		case '+':
			result = num1 + num2;
			System.out.println("Result : " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println("Result : " + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println("Result : " + result);
			break;	
		case '/':
			if(num2 != 0) {
				result = num1 / num2;
				System.out.println("Result : " + result);
			}else {
				System.out.println("Division by zero is not allowed");
			}
			break;
			
		case '%':
			result = num1 % num2;
			System.out.println("Result : " + result);
			break;	
		default: System.out.println("Enter proper operation to perform");	
		}
		sc.close();
		
  		

	}

}
