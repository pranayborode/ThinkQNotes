package com.assignment20array2;

import java.util.Scanner;

//1. WAJP2  
//a. add elements to single dimensional int array  
//b. print elements from single dimensional int array  

//2. WAJP2 calculate the average value of array elements.

//3. WAJP2 test if an array contains a specific value.  

//4. WAJP2 find the index of an array element value.  

public class Q1ArrayOperations {

	static Scanner sc = new Scanner(System.in);

	public static int[] addArrayElements() {

		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Elements for Array: ");
		for (int i = 0; i < arr.length; i++) {

			System.out.print("Element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		return arr;

	}

	public static void averageValueArray(int arr[]) {

		int sum = 0;
		int len = arr.length;
		for (int i = 0; i < len; i++) {

			sum += arr[i];
		}

		int average = sum / (len - 1);
		System.out.println("Average value of array elements: " + average);
	}

	public static boolean checkNumber(int ar[]) {

		System.out.println("Enter a Number to find in Array:");

		int num = sc.nextInt();

		boolean status = false;
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == num) {
				status = true;
				break;
			}

		}
		return status;

	}

	public static void printIndexOfElement(int ar[]) {

		for (int i = 0; i < ar.length; i++) {

			System.out.println("Index value of " + ar[i] + " is : " + i);
		}

	}

	public static void main(String[] args) {

		int ar[] = addArrayElements();

		for (int x : ar) {
			System.out.print(x + " ");
		}

		System.out.println();
		averageValueArray(ar);

		printIndexOfElement(ar);

		if (checkNumber(ar)) {
			System.out.println("Enter value is present in Array");
		} else {
			System.out.println("Enter value is Not present in Array");
		}
		
		sc.close();
	}

}
