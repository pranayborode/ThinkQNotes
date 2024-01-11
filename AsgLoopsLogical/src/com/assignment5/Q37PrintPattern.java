package com.assignment5;

import java.util.Scanner;

public class Q37PrintPattern {

	public static void printPattern(int row) {

		for (int i = 1; i <= row; i++) {
			int num;
			if (i % 2 == 0) {
				num = 0;
				for (int j = 1; j <= row; j++) {
					System.out.print(num);
					num = (num == 0) ? 1 : 0;
				}
			} else {
				num = 1;
				for (int j = 1; j <= row; j++) {
					System.out.print(num);
					num = (num == 0) ? 1 : 0;
				}
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
