package com.assignment1;


// 2. Write a Java program to enter two numbers and perform all arithmetic operations.
public class ArithmeticOperations {

	public static void main(String[] args) {
		
		int num1 = 20, num2 =10;
		
		int sum = num1 + num2;
		int min = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;
		
		System.out.println("num1 + num2 = "+sum);
		System.out.println("num1 - num2 = "+min);
		System.out.println("num1 * num2 = "+mul);
		System.out.println("num1 / num2 = "+div);
		System.out.println("num1 % num2 = "+mod);
		

	}

}
