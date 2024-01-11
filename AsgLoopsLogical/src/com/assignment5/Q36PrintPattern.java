package com.assignment5;

import java.util.Scanner;

public class Q36PrintPattern {

	public static void printPattern(int row) {

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		for (int i = row - 1; i >= 1; i--) {

			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
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
