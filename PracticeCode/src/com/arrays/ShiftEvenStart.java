package com.arrays;

import java.util.Arrays;

public class ShiftEvenStart {
	
	static void shiftEvenStart(int arr[]) {
		
		int length = arr.length;
		int temp = 0;
		
		
		for(int i = 0; i<length; i++) {
			
			if(arr[i]%2 ==0) {
				continue;
			}else {
				for(int j = arr.length-1; j>=0 && i<j; j--) {
					
					if(arr[j] % 2 ==0) {
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
		int arr[] = { 3, 4, 1, 7, 2, 9, 8 };

		shiftEvenStart(arr);
		System.out.println(Arrays.toString(arr));

	}

}
