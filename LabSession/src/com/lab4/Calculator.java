package com.lab4;

import java.util.Scanner;

public class Calculator {

	
	public static void performOperation() {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		char operator;
		char ch;
		
		do {

			System.out.println("Enter First Number");
			num1 = sc.nextInt();
			System.out.println("Enter Second Number");
			num2 = sc.nextInt();
			
			System.out.println("Enter The Operation to Perform");
		    operator = sc.next().charAt(0);
		    
		    if (operator == '+') {
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			} else if (operator == '-') {
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			} else if (operator == '*') {
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			} else if (operator == '/') {
				if(num2 ==0) {
					System.out.println("Do Not enter second number 0");
					performOperation();
				}else {
					System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));	
				}
				
			} else if (operator == '%') {
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
			} else {
				System.out.println("Enter valid input");
			}
		    
		    System.out.println("Do you want to do more operation again");

		    ch = sc.next().charAt(0);
		    

		} while (ch == 'Y' || ch == 'y');
		sc.close();
	}
	
	public static void main(String[] args) {
		
		performOperation();

	}

}
