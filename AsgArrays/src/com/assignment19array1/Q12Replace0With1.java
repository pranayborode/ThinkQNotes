package com.assignment19array1;

import java.util.Arrays;

// WAP to replace all the 0’s with 1’s in your array. 
//Your array is [26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34]  

public class Q12Replace0With1 {

	
	public static void replaceZerosWithOnes(int ar[]) {
		
		for(int i = 0; i<ar.length; i++) {
			
			if(ar[i]==0) {
				ar[i] = 1;
			}
		}
		for(int x : ar) {
			System.out.print(x+"  ");
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};
		
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		replaceZerosWithOnes(arr);

	}

}
