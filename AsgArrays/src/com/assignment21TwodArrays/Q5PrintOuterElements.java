package com.assignment21TwodArrays;

//5.	WAP to print outer elements of 2D array of 4X4.
public class Q5PrintOuterElements {

	public static void printOuter(int arr[][]) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				if ((i == 0) || (i == 3) || (j == 0) || (j == 3)) {

					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, 
				        { 5, 6, 7, 8 }, 
				        { 9, 3, 5, 7 }, 
				        { 3, 5, 8, 9 } };

		printOuter(arr);
	}

}
