package com.assignment21TwodArrays;

//6.	WAP to check if a matrix is a Sparse matrix (in which most of the elements are 0).
//      Print “Sparse” if it is Sparse else print “Not sparse”
public class Q6SparseMatrix {

	public static void countZeros(int arr[][]) {

		int row = arr.length;
		int col = arr[0].length;
		int count = 0;
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				if (arr[i][j] == 0) {
					++count;
				}
			}
		}

		if (count > (row * col / 2)) {
			System.out.println("Sparse");
		} else {
			System.out.println("Not Sparse");
		}

	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 0, 4 }, { 0, 0, 5 }, { 9, 0, 0 } };
		countZeros(arr);
	}

}
