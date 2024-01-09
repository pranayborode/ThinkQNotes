package com.assignment20array2;

import java.util.Arrays;
import java.util.Scanner;

//10. WAJP2 delete an element from an array at specified position. 
public class Q10DeleteElement {

	public static void deleteArray(int arr[]) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter position value to delete Element");

		int pos = sc.nextInt();
		int size = arr.length;
		for (int i = (pos - 1); i < size - 1; i++) {

			arr[i] = arr[i + 1];

		}
		size = size - 1;

		for (int i= 0; i<size; i++) {

			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println(Arrays.toString(arr));

		deleteArray(arr);

	}

}
