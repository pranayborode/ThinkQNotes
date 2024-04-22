package com.lab6;

import java.util.Scanner;

public class TwinPrimeNumber {

	public static boolean checkPrime(int num) {
		
		boolean status = true;
		
		if(num == 0 || num ==1) {
			status = false;
		}else {
			for(int i = 2; i< num; i++) {
				
				if(num % i == 0) {
					status = false;
					break;
					
					
					
				}
			}
		}
		return status;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		if(checkPrime(num1) && checkPrime(num2) && (num2 - num1 == 2) ) {
			System.out.println(num1+ " & "+num2+" are twin prime numbers");
		}else {
			System.out.println("Not twin prime number");
		}

	}

}
