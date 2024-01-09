package com.assignment21TwodArrays;


//9. System.out.println("Sum of " + (i + 1) + " Row:" + sumRow);
public class Q9SumOfEachRowColmMatrix {

	public static void sumEachRowColm(int ar[][]) {

		int rows = ar.length;
		int cols = ar[0].length;
		int sumRow, sumCol;

		for (int i = 0; i < rows; i++) {
			sumRow = 0;
			for (int j = 0; j < cols; j++) {
				sumRow += ar[i][j];
			}
			System.out.println("Sum of " + (i + 1) + " Row:" + sumRow);
		}

		System.out.println("=============================");
		for (int i = 0; i < cols; i++) {
			sumCol = 0;
			for(int j = 0; j<rows; j++) {
				sumCol += ar[j][i]; 
			}
			System.out.println("Sum of " + (i + 1) + " Colum:" + sumCol);
		}
	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		sumEachRowColm(arr);

	}

}
