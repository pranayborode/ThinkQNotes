package com.assignment20array2;

import java.util.Arrays;

//22. WAJP2 find the maximum and minimum value in an array.  
public class Q22MaxMinValue {

	public static void findMaxMinValue(int arr[]) {

		int minValue = arr[0];
		int maxValue = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < minValue) {

				minValue = arr[i];

			} else if (arr[i] > maxValue) {

				maxValue = arr[i];

			}
		}
		System.out.println("Minimum in Array : " + minValue);
		System.out.println("Maximum in Array : " + maxValue);

	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 6, 9, 5, 0 };

		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------------------");
		findMaxMinValue(arr);

	}

}
