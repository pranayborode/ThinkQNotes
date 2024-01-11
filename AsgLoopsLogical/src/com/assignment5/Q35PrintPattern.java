package com.assignment5;

import java.util.Scanner;

public class Q35PrintPattern {

	
	public static void printPattern(int row) {
		int n = 1; 
		for(int i = 1; i<=row; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print(n+" ");
				n++;
			}
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
