package com.assignment5;

import java.util.Scanner;

public class Q17DisarumNumber {

	public static boolean isDisariumNumber(int number) {
		int sum = 0;
		int temp = number;
		int length = (int) Math.log10(number) + 1; // Calculate the number of digits

		while (temp > 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, length--);
			temp /= 10;
		}

		return sum == number;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		boolean isDisarium = isDisariumNumber(number);

		if (isDisarium) {
			System.out.println(number + " is a Disarium number.");
		} else {
			System.out.println(number + " is not a Disarium number.");
		}

		sc.close();

	}

}
