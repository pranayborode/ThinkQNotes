package com.arrays;

import java.util.Arrays;

public class ItselfReverse {
	
	static void findReverseArray1(int arr[]) {
		
		int start = 0;
		int end = arr.length-1;
		
		while (start < end) {
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end --;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	static void findReverseArray2(int arr[]) {
		
		int revArr[] = new int [arr.length];
		int index = 0;
		
		for(int i= arr.length-1; i>=0; i--) {
			
			if(index < revArr.length) {
				revArr[index] = arr[i];
				index++;
				
			}
		}
		for (int j = 0; j < revArr.length; j++) {
			System.out.print(revArr[j] + "  ");
		}
	}

	public static void main(String[] args) {
		

		int arr[] = { 3, 90, 45, 29, 37, 78 };
		System.out.println(Arrays.toString(arr));

		System.out.println("using temporary array");
		findReverseArray1(arr);
		
		System.out.println("\nwithout using temporary array");
        findReverseArray2(arr);

	}

}
