package com.assignment5;

import java.util.Scanner;

public class Q40PrintPattern {

	public static void printPattern(int row) {
		for (int i = 0; i <= row; i++)   
		{  
		int ch = 65;   
		for (int j = 8; j > i; j--)  
		{  
		System.out.print(" ");  
		}  
		for (int k = 0; k <= i; k++)  
		{  
		System.out.print((char) (ch + k) + " ");  
		}  
		System.out.println();  
		}  
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int row = sc.nextInt();

		printPattern(row);

		sc.close();

	}

}
