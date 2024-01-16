package com.arrays;

import java.util.Arrays;

public class ItselfReverseArray {
	
	static void findSelfReverseArray(int arr[]) {
		
		int newArr[] = new int[arr.length];
		int index  = 0;
		
		for(int i= arr.length-1; i>=0; i--) {
			newArr[index]= arr[i];
			index++;
		}
		System.out.println(Arrays.toString(newArr));
	}

	static void findSelfReverseArray2(int arr[]) {
		
		int start = 0; 
		int end = arr.length-1;
		
		while(start<end) {
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {

		int arr[] = { 3, 90, 45, 29, 37, 78 };

		findSelfReverseArray2(arr);
	}

}
