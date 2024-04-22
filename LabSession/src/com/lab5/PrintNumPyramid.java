package com.lab5;

public class PrintNumPyramid {

	public static void printPattern() {

		int n = 1;

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(n + " ");
				n++;
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {

		printPattern();

	}
}

// 1
// 2 3
// 4 5 6