package com.arrays;

import java.util.Arrays;

public class NegativeAtStart {
	
	static void shiftNegativeFront(int arr[]) {
		
		int temp = 0;
		int size = arr.length;
		
		for(int i=0; i<size ; i++) {
			
			if(arr[i] < 0) {
				continue;
			}else {
				
				for(int j = size-1; j>=0 && i<j; j-- ) {
					
					if (arr[j]<0) {
						
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						break;
					}
				}
			}
		}
		
	}
	

	public static void main(String[] args) {

		int arr[] = { 1, -2, 3, -4, 0, 5 };
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("After shifting");
		
		shiftNegativeFront(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
