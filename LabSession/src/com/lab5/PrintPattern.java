package com.lab5;

import java.util.Scanner;

public class PrintPattern {

	public static void printSpacePattern(int row) {

		for (int i = 1; i <= row; i++) {

			for (int sp = 1; sp <= row - 1; sp++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void printInvertedHalfPyramid(int row) {

		for (int i = 1; i <= row; i++) {

			for (int sp = 1; sp <= row - i; sp++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pyramidPattern(int row) {

		for (int i = 1; i <= row; i++) {

			for (int sp = 1; sp <= row - i; sp++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void diamondPattern(int row) {

		// for first half
		for (int i = 1; i <= row; i++) {

			for (int sp = 1; sp <= row - i; sp++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// for second half
		for (int i = row - 1; i >= 1; i--) {

			for (int sp = row - 1; sp >= i; sp--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printArrow(int row) {
		for (int i = 1; i <= row; i++) {

			for (int sp = 1; sp <= row - 1; sp++) {

				if (i == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = row - 1; i >= 1; i--) {

			for (int sp = row - 1; sp >= 1; sp--) {
				System.out.print(" ");
			}

			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public static void printBorderOfSquare() {
		
		int row = 5;
		for(int i = 1; i<=row; i++) {
			
			for(int j = 1; j<=row; j++) {
				if(i==1 || i==row  || j==1 || j==row ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			
			System.out.println();		
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows");
		int row = sc.nextInt();

		// printSpacePattern(row);
		 //printInvertedHalfPyramid(row);
		// pyramidPattern(row);
		 diamondPattern(row);
		// printArrow(row);	
		//printBorderOfSquare();
		
		sc.close();
	}

}
