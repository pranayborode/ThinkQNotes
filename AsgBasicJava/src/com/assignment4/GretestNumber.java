package com.assignment4;

import java.util.Scanner;

// 10)find which is greatest  number in between 2 numbers  using switch.

public class GretestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter second number: ");
		double num2 = sc.nextDouble();
		
		int result;
		
		if(num1 > num2) {
			result = 1;          // if num1 is greater 
		}else if (num2 > num1){
			result = 2;          // if num2 is greater 
		}else {
			result = 3;          // if both are equal
		}
		
		switch(result) {
		case 1:
			System.out.println("Greatest Number is "+num1);
			break;
		case 2: 
			System.out.println("Greatest Number is "+num2);
			break;
		case 3:
			System.out.println("Both Numbers "+num1+" and "+num2+ " are Equal");
		}
		sc.close();

	}

}
