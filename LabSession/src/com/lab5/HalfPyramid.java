package com.lab5;

public class HalfPyramid {

	public static void printPattern() {

		int n = 5;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		printPattern();
		
	}

}
