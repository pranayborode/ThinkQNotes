package com.assignment5;

import java.util.Scanner;

public class Q31PrintPattern {

	public static void pyramidPattern(int row) {

		for (int i = row ; i >= 1; i--) {

			for (int sp = row-1 ; sp >= i; sp--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows");
		int row = sc.nextInt();
		
		pyramidPattern(row);
		sc.close();
		
		

	}

}
