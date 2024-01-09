package com.assignment21TwodArrays;

//7.	WAP to create transpose of a matrix (transpose is converting rows to columns) and print it.
public class Q7TransposeMatrix {

	static int[][] findTranspose(int a1[][]) {

		int cols = a1.length; // number of rows of a1
		int rows = a1[0].length; // number of cols of a1

		int tarr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {
				tarr[i][j] = a1[j][i];

			}
		}
		return tarr;
	}

	static void display(int a[][]) {

		for (int i = 0; i < a.length; i++) {

			for (int j : a[i]) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
	}

	public static void main(String[] args) {

		int m1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

		display(m1);
		
		int trm[][]= findTranspose(m1);
		
		display(trm);
	}


}
