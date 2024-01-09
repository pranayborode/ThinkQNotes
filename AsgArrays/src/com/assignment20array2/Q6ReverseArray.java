package com.assignment20array2;

//6. WAJP2 print reverse of an array. 

public class Q6ReverseArray {

	public static void printRrverseArray(int ar[]) {

		for (int i = ar.length - 1; i >= 0; i--) {

			System.out.print(ar[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 3, 5, 6, 8, 9, 0 };

		printRrverseArray(arr);
	}

}
