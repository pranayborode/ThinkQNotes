package com.assignment21TwodArrays;

//printUpperTriangularMatrix
public class Q12UpperTriangularMatrix {

	public static void printUpperTriangularMatrix(int ar[][]) {
		
		int rows = ar.length;
		int cols = ar[0].length;
		
		if(rows != cols) {
			System.out.println("Matrix is not a square matrix: ");
			return;
		}
		
		System.out.println("Upper Triangular Matrix:");
		
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				
				if(j >=i) {
					System.out.print(ar[i][j]+"\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// 00 01 02
		// 10 11 12
		// 20 21 22

		printUpperTriangularMatrix(arr);
	}

}
