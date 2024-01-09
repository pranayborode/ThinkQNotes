package com.assignment21TwodArrays;

//10.	WAP to find sum of main diagonal elements of a matrix.
public class Q10SumOfMainDiagonal {

	public static void sumOfMainDiagonal(int ar[][]) {
		
		int rows = ar.length;
		int cols = ar[0].length;
		int sum = 0;
		
		for(int i = 0; i<rows; i++) {
			
			for(int j = 0; j<cols; j++) {
				
				if(i == j ) {
					sum =sum + ar[i][j];
				}
			}
		}
		System.out.println("sum of main diagonal elements of a matrix is "+sum);
	}
	
	public static void main(String[] args) {
		
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// 00 01 02
		// 10 11 12
		// 20 21 22
		
		sumOfMainDiagonal(arr);

	}

}
