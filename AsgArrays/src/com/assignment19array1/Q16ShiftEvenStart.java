package com.assignment19array1;

import java.util.Arrays;

// WAP to arrange the elements of an given array of integers where all Even integers 
// appear before all the Odd integers. 

public class Q16ShiftEvenStart {

	public static void shiftEvenStart(int ar[]) {

		int temp = 0;
		int len = ar.length;

		for (int i = 0; i < len; i++) {

			if (ar[i] % 2 == 0) {
				continue;
			} else {
				for (int j = len - 1; j >= 0 && i < j; j--) {

					if (ar[j] % 2 == 0) {

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
		int arr[] = { 3, 4, 1, 7, 2, 9, 8 };

		shiftEvenStart(arr);
		System.out.println(Arrays.toString(arr));
	}

}
