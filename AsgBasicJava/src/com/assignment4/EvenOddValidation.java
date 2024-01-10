package com.assignment4;

import java.util.Scanner;

// 2.Write a Java program to check whether a number is even or odd using switch case 

public class EvenOddValidation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int num = sc.nextInt();
		
		switch(num % 2) {
		case 0:
			System.out.println("Even");
			break;
			
		case 1:
			System.out.println("odd");
			break;
		default: System.out.println("Error");
		
		}

	}

}
