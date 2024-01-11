package com.assignment5;

import java.util.Scanner;

public class Q33PrintPattern {

	
	public static void printInvertedDiamond(int row) {

		
		for (int i = 1 ; i <= row-1; i++) {

			for (int sp = 1 ; sp <= i-1; sp++) {
				System.out.print(" ");
			}
			for (int j = i; j <= row -1; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for (int i = row-1; i >= 1; i--) {

			for (int sp = 1 ; sp <= i-1; sp++) {
				System.out.print(" ");
			}
			for (int j = i; j <= row -1; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows");
		
		 int row = sc.nextInt();

		printInvertedDiamond(row);
		sc.close();

	}

}
