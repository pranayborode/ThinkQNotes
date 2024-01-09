package com.assignment20array2;

import java.util.Arrays;

public class Q29ShortArrayAscending {

	public static void shortAscending(int arr[]) {
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = { 2, 3, 5, 1, 6, 9, 7 };

		System.out.println(Arrays.toString(arr));
		shortAscending(arr);
	}

}
