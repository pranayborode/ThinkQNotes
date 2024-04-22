package com.lab11;

import java.util.Scanner;

public class PrintPattern {

	static void printNumPattern(int row) {

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = row-1; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. of Rows");
		int row = sc.nextInt();

		printNumPattern(row);

		sc.close();

	}

}
