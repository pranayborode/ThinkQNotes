package com.assignment5;

//2. WAP to print odd numbers from 521 to 229 using while loop. 

public class Q2PrintOddNumber {

	public static void main(String[] args) {

		for (int i = 521; i >= 229; i--) {

			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
