package com.assignment5;

public class Q28PrintPattern {

	public static void main(String[] args) {

		int n = 8;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n-1; i >= 1; i--) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
