package com.assignment20array2;

import java.util.Arrays;
import java.util.Scanner;

public class Q32RightRotate {

	public static void rotateOnce(int arr[]) {

		int firstElement = arr[arr.length-1];

		for (int i = arr.length - 1; i >0 ; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = firstElement;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = { 1, 2, 3, 4, 5, 7, 9, 8 };

		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------------");

		System.out.println("Enter value to rotate elements left");

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			rotateOnce(arr);
		}
		System.out.println(Arrays.toString(arr));

		sc.close();
	}

}
