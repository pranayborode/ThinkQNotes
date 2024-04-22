package com.Lab1;

import java.util.Scanner;

public class EvenOddValidation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number :");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + "is even no.");
			if (num % 6 == 0) {
				System.out.println(num + "is divisible by 6");
			} else {
				System.out.println(num + "is not dividible by 6");
			}
		} else {
			System.out.println(num + "is odd no.");
			if (num % 5 == 0) {
				System.out.println(num + "is divisible by 5");
			} else {
				System.out.println(num + "is not dividible by 5");
			}
		}
		sc.close();

	}

}
