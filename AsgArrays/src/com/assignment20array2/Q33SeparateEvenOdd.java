package com.assignment20array2;

import java.util.Arrays;

//33. WAJP2 sort even and odd elements of array separately. 
public class Q33SeparateEvenOdd {

	public static void separateEvenOdd(int ar[]) {

		int size = ar.length;

		for (int i = 0; i < size; i++) {

			if (ar[i] % 2 == 0) {
				System.out.print(ar[i] + " ");

			}
		}
		for (int i = 0; i < size; i++) {

			if (ar[i] % 2 == 1) {
				System.out.print(ar[i] + " ");

			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 3, 4, 1, 7, 2, 9, 8 };

		separateEvenOdd(arr);
	}

}
