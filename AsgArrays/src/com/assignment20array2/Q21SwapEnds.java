package com.assignment20array2;

import java.util.Arrays;

//21. Given an array of ints, swap the first and last elements in the 
//array. Return the modified array. The array length will be at least 1. 
//swapEnds(*1, 2, 3, 4+) → *4, 2, 3, 1+  
//swapEnds(*1, 2, 3+) → *3, 2, 1+  
//swapEnds([8, 6, 7, 9, 5+) → *5, 6, 7, 9, 8+  

public class Q21SwapEnds {

	public static int[] swapEnds(int arr[]) {

		int start = arr[0];
		int end = arr[arr.length - 1];

		arr[0] = end;
		arr[arr.length - 1] = start;

		return arr;

	}

	public static void main(String[] args) {

		int swapEnds1[] = { 1, 2, 3, 4 };
		int swapEnds2[] = { 1, 2, 3 };
		int swapEnds3[] = { 8, 6, 7, 9, 5 };

		System.out.println("Original Array1 : " + Arrays.toString(swapEnds1));
		System.out.println("Swap Both Ends Array1 : " + Arrays.toString(swapEnds(swapEnds1)));
		System.out.println("-------------------------------------");

		System.out.println("Original Array2 : " + Arrays.toString(swapEnds2));
		System.out.println("Swap Both Ends Array2 : " + Arrays.toString(swapEnds(swapEnds2)));
		System.out.println("-------------------------------------");

		System.out.println("Original Array3 : " + Arrays.toString(swapEnds2));
		System.out.println("Swap Both Ends Array3 : " + Arrays.toString(swapEnds(swapEnds2)));
		System.out.println("-------------------------------------");

	}

}
