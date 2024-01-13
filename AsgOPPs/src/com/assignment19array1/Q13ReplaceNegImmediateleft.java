package com.assignment19array1;

public class Q13ReplaceNegImmediateleft {

	public static void convertNegToSquare(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 0 && i != 0) {
				ar[i] = ar[i - 1] * ar[i - 1];

			}
		}
		for (int i : ar) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { -12, 3, -19, 29, 5, -61, 44, 7, -9 };

		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nAfter converting negative value with square : ");
		
		convertNegToSquare(arr);
	}

}
