package com.assignment21TwodArrays;

public class Q13SumLowerTriangularMatrix {

public static void findSumLowerTriangularMatrix(int ar[][]) {
		
		int rows = ar.length;
		int cols = ar[0].length;
		int sum = 0;
		
		if(rows != cols) {
			System.out.println("Matrix is not a square matrix: ");
			return;
		}
		
		
		
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				
				if(i >=j) {
					sum += ar[i][j];
				}
			}
			
		}
		System.out.println("Sum of Lower Triangular Matrix:"+sum);
		
		
	}
	
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// 00 01 02
		// 10 11 12
		// 20 21 22

		findSumLowerTriangularMatrix(arr);
	}

}
