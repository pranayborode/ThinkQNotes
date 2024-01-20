package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
	
	static void deleteElement(int arr[], int pos) {
		
		int size = arr.length;
		
		for(int i = pos-1; i<size-1; i++) {
			arr[i] = arr[i+1];
			
		}
		size = size -1;
	
		for(int i=0; i<size ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter pos value to delelte the Element");

		int pos = sc.nextInt();
		
		deleteElement(arr, pos);
		
		
		
	}

}
