package com.assignment5;

import java.util.Scanner;

public class Q34PrintPattern {

	public static void printPattern(int row) {

		for (int i = 1; i <= row; i++) {
			for (int j = i; j < row; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				if (k == 1 || i == row || k == (2 * i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows");

		int row = sc.nextInt();

		printPattern(row);
		sc.close();

	}

}
