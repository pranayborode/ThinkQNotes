package com.lab13;

//6. WAP to take number and end number from user and find prime number between that range 
//eg start 1 and end 10
//print number 3 5 7

import java.util.Scanner;

public class PrimeNumber {

	public static boolean checkPrime(int num) {

		if (num == 0 || num == 1) {
			return false;
		} else {
			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					return false;

				}
			}
		}
		return true;

	}

	public static void printPrime(int num1, int num2) {

		boolean status = true;
		for (int i = num1; i <= num2; i++) {

			if (PrimeNumber.checkPrime(i))
				System.out.println(i);

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Starting Num :");
		int num1 = sc.nextInt();

		System.out.println("Enter End NUm :");
		int num2 = sc.nextInt();

		printPrime(num1, num2);
		sc.close();

	}

}
