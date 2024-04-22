package com.lab6;

import java.util.Scanner;

public class BouncyNumber {

	public static boolean increasingNumber(int num) {

		int rem;
		int temp = num;
		while (num != 0) {

			rem = num % 10;

			if (temp > rem) {
				num = num / 10;
				temp = rem;
			} else {
				break;
			}

		}
		if (num == 0) {
			return true;
		}
		return false;

	}

	public static boolean decreasingNumber(int num) {

		int rem;
		int temp = 0;
		while (num != 0) {

			rem = num % 10;

			if (temp < rem) {
				num = num / 10;
				temp = rem;
			} else {
				break;
			}

		}
		if (num == 0) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int num = sc.nextInt();

		if (increasingNumber(num)) {
			System.out.println(num + " is increasing number");
		} else if (decreasingNumber(num)) {
			System.out.println(num + " is decreasing number");
		} else {
			System.out.println(num + " is bouncy number");
		}

	}

}
