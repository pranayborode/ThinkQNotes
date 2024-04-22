package com.lab8;

public class PrintPrimeNumbers {

	public static void printPrime() {
		
		boolean status = true;
		for(int i = 1; i<=100; i++) {
			
			if(CheckPrimeNumber.checkPrime(i))
				System.out.println(i);
			
		}
			
			
	}
	
	public static void main(String[] args) {
		
		printPrime();

	}

}
