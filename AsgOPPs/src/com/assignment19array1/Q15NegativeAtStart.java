package com.assignment19array1;

import java.util.Arrays;

public class Q15NegativeAtStart {

	public static void shiftNegativeFront(int ar[]) {

		int temp;
		int size = ar.length;

		for (int i = 0; i < size; i++) {

			if (ar[i] < 0) {
				continue;
			} else {
				for (int j = size - 1; j >= 0 && i < j; j--) {

					if (ar[j] < 0) {
						temp = ar[i];
						ar[i] = ar[j];
						ar[j] = temp;
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, -2, 3, -4, 0, 5 };

		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("After shifting");
		shiftNegativeFront(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
