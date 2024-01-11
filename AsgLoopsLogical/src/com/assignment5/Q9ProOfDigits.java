package com.assignment5;

import java.util.Scanner;

//9.	 Write a Java program to calculate product of digits of any number.

public class Q9ProOfDigits {

	public static double findPro(int num) {
		
		int pro =1;
		do{
			
			pro *= num%10;
			num /=10;
			
			
		}while (num != 0);
		return pro;
	}
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eenter a number :");
		int n = sc.nextInt();
		
		
		System.out.println("Product of digits are:"+findPro(n));
		
	}

}
