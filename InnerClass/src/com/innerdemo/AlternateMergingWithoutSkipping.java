package com.innerdemo;

import java.util.Arrays;

public class AlternateMergingWithoutSkipping {

	
	public static void alternateMergingWtSkipp(int ar1[], int ar2[]) {
		
		
		int mer[] = new int [ar1.length + ar2.length];
		
		int index = 0;
		int totalSize = Math.max(ar1.length, ar1.length);
		
		for(int i = 0; i<totalSize; i++) {
			
	          if(i<ar1.length) {
	        	  mer[index++] = ar1[i];
	          }
	          if(i<ar2.length) {
	        	  mer[index++] = ar2[i];
	          }
		}
		System.out.println(Arrays.toString(mer));
		
	}
	
	public static void main(String[] args) {
		
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {6, 7, 8, 9};

		alternateMergingWtSkipp(arr1, arr2);
	}

}
