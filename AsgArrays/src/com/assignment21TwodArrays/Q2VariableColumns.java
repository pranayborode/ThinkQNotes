package com.assignment21TwodArrays;

import java.util.Scanner;

//2.	WAP to accept data in 2D array where rows are fixed and columns are variable.
public class Q2VariableColumns {
	static Scanner sc = new Scanner(System.in);

	public static void acceptData(int ar[][]) {

		int rows = ar.length;
		int col = ar[0].length;

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < col; j++) {

				System.out.println("Enter element for position : " + i + " " + j);

				ar[i][j] = sc.nextInt();
			}
		}
	}

	public static void display(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {

			for (int j : ar[i]) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("-----------------------------------");
	}

	public static void main(String[] args) {

		System.out.println("Enter num of columns");
		int numCol = sc.nextInt();

		int ar[][] = new int[3][numCol];

		acceptData(ar);
		display(ar);

	}

}
