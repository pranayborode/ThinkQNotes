package com.assignment5;

import java.util.Scanner;

//10.	Write a Java program to find frequency of each digit in a given integer.
public class Q10FrequencyOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number, i, count, digit, temp;
		
		System.out.println("Enter any Number : ");
		number = sc.nextInt();

		System.out.println("Digit\tFrequency");
		for (i = 0; i <= 9; i++) {
			count = 0;
			temp = number;
			while (temp > 0) {
				digit = temp % 10;

				if (digit == i) {
					count++;
				}
				temp = temp / 10;
			}
			if (count > 0) {
				System.out.println(i + "\t" + count);
			}
		}

	}

}
