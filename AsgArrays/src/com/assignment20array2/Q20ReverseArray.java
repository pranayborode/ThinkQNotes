package com.assignment20array2;

import java.util.Arrays;

/*20. Given an array of length 3, return a new array with the elements in reverse order,  
so {1, 2, 3} becomes {3, 2, 1}.  
reverse3(*1, 2, 3+) → *3, 2, 1+  
reverse3(*5, 11, 9+) → *9, 11, 5+  
reverse3(*7, 0, 0+) → *0, 0, 7+  */

public class Q20ReverseArray {

	public static int[] reverse3Elements(int ar[]) {

		int reverseArray[] = new int[3];

		reverseArray[0] = ar[2];
		reverseArray[1] = ar[1];
		reverseArray[2] = ar[0];

		return reverseArray;

	}

	public static void main(String[] args) {

		int array1[] = { 1, 2, 3 };
		int array2[] = { 5, 11, 9 };
		int array3[] = { 7, 0, 0 };

		System.out.println("Original Array 1: " + Arrays.toString(array1));
		System.out.println("Reversed Array 1: " + Arrays.toString(reverse3Elements(array1)));
		System.out.println("----------------------------------------");

		System.out.println("Original Array 1: " + Arrays.toString(array2));
		System.out.println("Reversed Array 1: " + Arrays.toString(reverse3Elements(array2)));
		System.out.println("----------------------------------------");

		System.out.println("Original Array 1: " + Arrays.toString(array3));
		System.out.println("Reversed Array 1: " + Arrays.toString(reverse3Elements(array3)));

	}

}
