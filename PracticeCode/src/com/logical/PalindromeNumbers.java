package com.logical;

import java.util.Scanner;

public class PalindromeNumbers {
	
	
	static boolean checkPalindrome(int num) {
		
		int original = num;
		int revNum = 0;
		
		do {
			int rem = num % 10;
			revNum =(revNum*10)+rem;
			num/=10;
			
		}while(num != 0);
		
		if(original == revNum) {
			return true;
		}else {
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
