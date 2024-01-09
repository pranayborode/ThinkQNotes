package com.assignment19array1;

import java.util.Arrays;

//4. WAP to reverse the array itself, don’t print array in reverse – I want current array 
//reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 
//37, 29, 45, 90, 3] by using temporary array.  
//5. WAP to reverse the array itself, don’t print array in reverse – I want current array 
//reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 
//37, 29, 45, 90, 3] without using temporary array.  

public class Q4ItselfReverse {

	static void findReverseArray1(int ar[]) {

		int revArr[] = new int[ar.length];
		int index = 0;
		for (int i = ar.length - 1; i >= 0; i--) {

			if (index < revArr.length) {
				revArr[index] = ar[i];
				index++;
			}

		}
		for (int j = 0; j < revArr.length; j++) {
			System.out.print(revArr[j] + "  ");
		}
	}
	
	static void findReverseArray2(int ar[]) {
		
		int start = 0;
		int end = ar.length-1;
		
		while(start < end) {
			
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			
			start++;
			end--;
		}
		
		for(int x : ar) {
			System.out.print(x+"  ");
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
