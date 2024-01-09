package com.assignment21TwodArrays;

import java.util.Scanner;

//1.wAP to accept data in 2D array of 3X4 and accept data.
public class Q1AcceptData2DArray {

	public static void acceptData(int ar[][]) {
		Scanner sc = new Scanner(System.in);
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

		int arr[][] = new int[3][4];

		acceptData(arr);
		display(arr);
	}

}
