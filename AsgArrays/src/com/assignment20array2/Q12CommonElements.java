package com.assignment20array2;

//12. WAJP2 find the common elements between two arrays. 
public class Q12CommonElements {

	public static void findCommonElements(int arr1[], int arr2[]) {

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + "  ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr1[] = { 12, 23, 34, 67, 78, 91, 56 };
		int arr2[] = { 39, 25, 15, 23, 55, 91, 66, 22 };

		findCommonElements(arr1, arr2);
	}

}
