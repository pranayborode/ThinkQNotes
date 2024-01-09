package com.assignment19array1;

public class Q1MaxValue {

	
	static void findMax(int ar[]) {
		
		int max = 0;
		for(int i = 0; i<ar.length; i++) {
			
			if(ar[i]>max) {
				max = ar[i];
			}
		}
		System.out.println("Max Value in given array is : "+max);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {20, 0, 31, 45, 100, 1, 105, 90};
		
		findMax(arr);

	}

}
