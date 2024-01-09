package com.assignment21TwodArrays;

//4.WAP to print minimum in columns. 
//Means e.g. arr[][]={{22, 31, 9}, {12, 5, 16}, {34, 42, 2}} output is: 12, 5, 2.
public class Q4ColWiseMin {

	public static void printMinInColu(int arr[][]) {

		for (int j = 0; j < arr[0].length; j++) {

			int minInCol = findMinInColumn(arr, j);
			System.out.println("Min Element in Row " + (j + 1) + " : " + minInCol);
		}
	}

	public static int findMinInColumn(int arr[][], int j) {

		int min = arr[0][j];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i][j] < min) {

				min = arr[i][j];
			}
		}
		return min;
	}

	public static void main(String[] args) {

		int arr[][] = { { 12, 31, 9 }, 
				        { 12, 5, 16 }, 
				        { 34, 42, 2 } };

		printMinInColu(arr);

	}

}
