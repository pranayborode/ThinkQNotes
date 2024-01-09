package com.assignment20array2;



//28. WAJP2 merge 2 arrays to 3rd array. 3rd array should not have 
//elements of same value. 
public class Q28MergeArraysUnique {

	public static void findCommonElements(int arr1[], int arr2[]) {

		
		
		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");	
				}
			}
		}
	}

	public static void main(String[] args) {

		int ar1[] = { 1, 4, 9, 7, 5, 6, 8 };
		int ar2[] = { 11, 9, 1, 14, 10, 5, 6 };

		findCommonElements(ar1, ar2);
	}

}
