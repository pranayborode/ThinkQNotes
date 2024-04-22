package com.lab15;

import java.util.Scanner;

public class PrintPattern {
	
	static void printPattern(int row) {
		
		for(int i=row; i>=1; i--) {
			
			for(int j = 1; j<=i; j++ ) {
				
				System.out.print(j);
				
			}
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Row No : ");
		int row = sc.nextInt();
		
		printPattern(row);

	}

}
