package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//3. WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and ArithmeticException
public class Q3MultipleException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			int arr[] = new int[3];
			System.out.println("Enter array elements:");

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("-------------------------------");
			for (int i = 0; i <= arr.length; i++) {

				try {
					System.out.println("Valeue: " + 100 / arr[i]);
				} catch (ArithmeticException e) {
					System.out.println(e);
				}

			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}

		System.out.println("Rest Of code...");
		sc.close();
	}

}
