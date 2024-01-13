package com.assignment19array1;

import java.util.Arrays;

//8. WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9, 0, 2, 4] 

public class Q8SwapArray {

	
	public static void swapArray(int ar[]) {
		
		int size = ar.length;
		int mid = size/2;
		
		for(int i = 0; i<mid; i++) {
			
			int temp = ar[i];
			ar[i] = ar[	i+mid];
			ar[i+mid] = temp;
		}
		for(int x : ar) {
			System.out.print(x+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2, 4, 9, 0};
		
		System.out.println(Arrays.toString(arr));
		
		swapArray(arr);

	}

}
