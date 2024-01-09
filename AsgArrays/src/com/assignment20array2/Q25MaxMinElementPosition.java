package com.assignment20array2;


//25. WAJP2 find maximum and minimum element positions in an array. 
public class Q25MaxMinElementPosition {

	public static void findPosition(int arr[]) {

		int minIndex = 0;
		int maxIndex = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			} else if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println("Position of MinIndex: "+minIndex);
		System.out.println("Position of MaxIndex: "+maxIndex);
	}

	public static void main(String[] args) {

		int arr[] = { 12, 34, 65, 23, 77, 56, 89, 5 };
		findPosition(arr);
	}

}
