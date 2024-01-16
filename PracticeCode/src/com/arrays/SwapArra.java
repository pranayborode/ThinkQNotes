package com.arrays;

import java.util.Arrays;

//WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9, 0, 2, 4] 

public class SwapArra {
	
	static void swapArray(int arr[]) {
		
		int size = arr.length;
		int mid = size/2;
		
		for(int i = 0; i<mid; i++) {
			
			int temp = arr[i];
			arr[i]= arr[i+mid];
			arr[i+mid] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 9, 0 };

		System.out.println(Arrays.toString(arr));

		swapArray(arr);
	}

}
