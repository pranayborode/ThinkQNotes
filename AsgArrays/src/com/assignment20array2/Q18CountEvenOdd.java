package com.assignment20array2;

import java.util.Arrays;

//18. WAJP2 count total number of even and odd elements in an array. 
//19. WAJP2 put even and odd elements of array in two separate arrays. 
public class Q18CountEvenOdd {

	public static void countEvenOddElements(int arr[]) {

		int evenCount = 0, oddCount = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		int evenArray[] = new int[evenCount];
		int oddArray[] = new int[oddCount];

		int eIndex = 0;
		int oIndex = 0;

		for (int x : arr) {

			if (x % 2 == 0) {
				evenArray[eIndex++] = x;
			} else {
				oddArray[oIndex++] = x;
			}
		}

		System.out.println("Count of EvenNo: " + evenCount);
		System.out.println("Count of OddNo : " + oddCount);

		System.out.println("---------------------------------------");

		System.out.println("Even Numbers :" + Arrays.toString(evenArray));
		System.out.println("Odd Numbers  :" + Arrays.toString(oddArray));

	}

	public static void main(String[] args) {

		int arr[] = { 2, 1, 18, 3, 8, 9, 3, 5, 6, 8, 7 };

		System.out.println(Arrays.toString(arr));
		System.out.println("---------------------------------------");

		countEvenOddElements(arr);

	}

}
