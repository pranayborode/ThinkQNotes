package com.assignment20array2;

//14. WAJP2 insert an element in a specific position into an array.  
import java.util.Scanner;

public class Q14InsertElement {

	public static void insertElement(int arr[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Element: ");
		int num = sc.nextInt();

		System.out.println("Enter Position: ");
		int pos = sc.nextInt();

		int size = arr.length;

		int newArray[] = new int[size + 1];

		for (int i = 0; i < size + 1; i++) {

			if (i < (pos - 1)) {
				newArray[i] = arr[i];
			} else if (i == pos - 1) {
				newArray[i] = num;

			}else {
				newArray[i]= arr[i-1];
			}
		}
		for(int x : newArray) {
			System.out.println(x +" ");
		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		insertElement(arr);
	}

}
