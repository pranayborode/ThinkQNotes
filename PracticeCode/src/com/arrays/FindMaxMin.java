package com.arrays;

public class FindMaxMin {
	
private static void findMax(int[] arr) {
		
		int max = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println(max);
	}

	static void findMin(int[] arr) {
		int min =Integer.MAX_VALUE;
		for(int i= 0; i<arr.length; i++) {
			
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {

		int arr[] = { 20, 31, 45, 100, 1, 105, 90 };

		findMax(arr);
		findMin(arr);
	}

	
}
