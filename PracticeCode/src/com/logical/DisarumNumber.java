package com.logical;

import java.util.Scanner;

public class DisarumNumber {
	
	static boolean isDisarumNo(int num) {
		
		int sum = 0;
		int temp = num;
		int length = (int) (Math.log10(num)+1);
		
		while(temp > 0) {
			int digit = temp%10;
			sum += Math.pow(digit, length--);
			temp /= 10;
		}
		
		return sum == num;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

	if(isDisarumNo(number)) {
		System.out.println(number + " is a Disarium number.");
	} else {
		System.out.println(number + " is not a Disarium number.");
	}
	sc.close();

	}

}
