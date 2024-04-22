package com.lab8;

import java.util.Scanner;

public class CheckPrimeNumber {

	
	public static boolean checkPrime(int num) {
		
		if (num == 0 || num == 1) {
			return  false;
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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");

		int num = sc.nextInt();
		
		if(checkPrime(num)) {
			System.out.println(num+ " is a prime number");
		}else {
			System.out.println(num+ " is a not a prime number");
		}
	}

}
