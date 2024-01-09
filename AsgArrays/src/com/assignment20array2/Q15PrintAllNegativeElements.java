package com.assignment20array2;

import java.util.Arrays;


//15. WAJP2 print all negative elements in an array. 

public class Q15PrintAllNegativeElements {

	
	public static void printNegativeElements(int arr[]) {
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i]<0) {
				
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, -2, 5, -6, -3, 9, -10, 0};

		System.out.println(Arrays.toString(arr));
		
		printNegativeElements(arr);
	}

}
