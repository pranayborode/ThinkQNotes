package com.assignment19array1;

public class Q2MinValue {

	static void findMin(int ar[]) {

		int min = 0;

		for (int i = 1; i < ar.length; i++) {

			if (ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println("Min Value in given array is : " + min);
	}

	public static void main(String[] args) {

		int arr[] = { -20, 0, -25, 15, 19, 37, 23 };

		findMin(arr);

	}

}
