package com.arrays;

import java.util.Arrays;

public class SwapArray {
	
	static void swapArray(int arr[]) {
		
		int size = arr.length;
		int mid = size/2;
		
		for(int i=0; i<mid; i++) {
			
			int temp = arr[i];
			arr[i] = arr[i+mid];
			arr[i+mid] = temp;
		}
		
		for(int x: arr) {
			System.out.print(x+" ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 2, 4, 9, 0 };

		System.out.println(Arrays.toString(arr));

		swapArray(arr);

	}

}
