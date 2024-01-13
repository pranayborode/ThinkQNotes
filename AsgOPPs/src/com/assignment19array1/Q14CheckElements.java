package com.assignment19array1;

//14. WAP to check if an array of integers contains two specified elements 65 and 77. 
public class Q14CheckElements {

	public static boolean checkElements(int ar[]) {

		boolean statusE1 = false;
		boolean statusE2 = false;

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == 65) {
				statusE1 = true;
			} else if (ar[i] == 77) {
				statusE2 = true;
			}

			if (statusE1 && statusE2) {
				break;
			}
		}
		return statusE1 && statusE2;

	}

	public static void main(String[] args) {

		int arr[] = { 12, 34, 65, 23, 77, 56 };

		
		if(checkElements(arr)) {
			System.out.println("Array contain elements 65 and 77");
		}else {
			System.out.println("Array Not contain elements 65 and 77");
		}
	}

}
