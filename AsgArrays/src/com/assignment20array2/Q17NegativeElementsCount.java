package com.assignment20array2;


//17. WAJP2 count total number of negative elements in an array. 
public class Q17NegativeElementsCount {

	public static void countNegativeElements(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 0) {
				count++;

			}
		}

		System.out.println("Total number of negative elements Count : " + count);
	}

	public static void main(String[] args) {

		int arr[] = { 1, -2, 4, -3, 6, -7, -8 };
		countNegativeElements(arr);
	}

}
