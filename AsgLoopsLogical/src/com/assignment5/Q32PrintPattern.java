package com.assignment5;

import java.util.Scanner;

public class Q32PrintPattern {

	public static void printInvertedHalfPyramid(int row) {

		for (int i = row; i >= 1; i--) {

			for (int sp = row - 1; sp >= i; sp--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows");
		int row = sc.nextInt();

		printInvertedHalfPyramid(row);
		sc.close();

	}

}
