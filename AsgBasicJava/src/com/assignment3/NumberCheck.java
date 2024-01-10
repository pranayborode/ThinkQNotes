package com.assignment3;

import java.util.Scanner;

//6. Write a Java program to check whether a number is negative, positive or zero 

public class NumberCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		double num = sc.nextDouble();
		
		if(num > 0) {
			System.out.println("The number is positive");
		}else if (num < 0) {
			System.out.println("The number is negative");
		}else {
			System.out.println("The number is zero");
		}
		sc.close();

	}

}
