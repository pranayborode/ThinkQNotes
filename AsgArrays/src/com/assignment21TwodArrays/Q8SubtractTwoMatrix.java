package com.assignment21TwodArrays;

//8.	WAP to subtract two matrices.

public class Q8SubtractTwoMatrix {

	
	public static void subTwoMatrix(int m1[][], int m2[][]) {
		
		int rows = m1.length;
		int cols = m1[0].length;
		
		int dif[][] = new int [rows][cols];
		
		for(int i = 0; i< rows; i++) {
			
			for(int j = 0; j< cols; j++) {
				dif[i][j] = m1[i][j] - m2[i][j];
			}
		}
		
		System.out.println("Subtraction of two matrix : ");
		
		for(int i=0; i<dif.length;i++) {
			for(int j: dif[i]) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {

		int matrix1[][] = { { 4, 6, 7 }, { 6, 8, 9 }, { 7, 4, 8 } };

		int matrix2[][] = { { 2, 5, 2 }, { 6, 1, 3 }, { 2, 3, 7 } };

		subTwoMatrix(matrix1, matrix2);
	}

}
