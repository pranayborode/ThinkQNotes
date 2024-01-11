package com.assignment5;

import java.util.Scanner;

public class Q39PrintPattern {

	public static void printPattern(int row) {
		int ch = 65;  
		
		for (int i = 0; i<= 9; i++)  
		{  
		
		for (int j = 0; j <= i; j++)  
		{  
		
		System.out.print((char) ch + " ");  
		}  
		ch++;  
		System.out.println();  
		}  
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int row = sc.nextInt();

		printPattern(row);

	}

}
