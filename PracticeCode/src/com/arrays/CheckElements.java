package com.arrays;

//WAP to check if an array of integers contains two specified elements 65 and 77
public class CheckElements {

	static boolean checkElement(int arr[]) {

		boolean status1 = false;
		boolean status2 = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 65) {
				status1 = true;
			} else if (arr[i] == 77) {
				status2 = true;
			}

			if (status1 && status2) {
				break;
			}

		}
		return status1 && status2;
	}

	public static void main(String[] args) {
		
		int arr[] = { 12, 34, 65, 23, 77, 56 };

		if(checkElement(arr)) {
			System.out.println("Aarray contains elements 65 and 77");
		}else {
			System.out.println("Aarray does not contains elements 65 and 77");	
		}
	}

}
