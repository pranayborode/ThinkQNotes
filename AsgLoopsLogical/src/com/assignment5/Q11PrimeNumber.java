package com.assignment5;

import java.util.Scanner;

//11.	Find all prime number between 400 to 300;

public class Q11PrimeNumber {

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

	public static void main(String[] args) {

		System.out.println("Prime numbers between 400 to 300 are");
		for (int i = 400; i >= 300; i--) {
			if (checkPrime(i))
				System.out.println(i);
		}

	}

}
