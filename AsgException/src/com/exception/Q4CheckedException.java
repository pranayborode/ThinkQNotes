package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//4. WAP to show checked exception and use multiple catch block with universal Exception handler.
public class Q4CheckedException {

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
		} catch (IndexOutOfBoundsException | InputMismatchException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("Finally block"); //always exicute
			sc.close();
		}
		

		System.out.println("Rest Of code...");
		sc.close();
	}

}
