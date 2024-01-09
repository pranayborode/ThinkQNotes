package com.assignment20array2;

//13. WAJP2 find the second largest element in an array. 
public class Q13SecondLarges {

	public static void sortingArray(int ar[]) {

		int maxArray = ar[0];
		int secMax = 0;

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > maxArray) {

				secMax = maxArray;
				maxArray = ar[i];
			} else if (secMax < ar[i] && ar[i] != maxArray) {
				secMax = ar[i];
			}
		}
		System.out.println("Maximum Number : " + maxArray);
		System.out.println("Second Max : " + secMax);
	}

	public static void main(String[] args) {

		int arr[] = { 12, 35, 30, 45, 32 };

		sortingArray(arr);
	}

}
