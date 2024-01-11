package com.assignment5;

import java.util.Scanner;

//18.	check no is palindrome or not

public class Q18PalindromeNumbers {

	public static boolean checkPalindrome(int num) {

		int origninal = num;
		int revNum = 0;

		do {
			int rem = num % 10;

			revNum = (revNum * 10) + rem;

			num /= 10;
		} while (num != 0);

		if (origninal == revNum) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");

		int n = sc.nextInt();

		if (checkPalindrome(n)) {
			System.out.println(n + " is a palindrome number.");
		} else {
			System.out.println(n + " is not a palindrome number.");
		}

	}

}
