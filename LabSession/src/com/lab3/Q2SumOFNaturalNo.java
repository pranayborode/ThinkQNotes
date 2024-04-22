package com.lab3;

import java.util.Scanner;

public class Q2SumOFNaturalNo {
	
	public static void sumNaturalNum(int n) {
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {

			sum += i;

		}

		System.out.println("Sum of first " +n+ " Natural Number : " + sum);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		sumNaturalNum(n);
		
		
	}

}
