package com.logical;

import java.util.Scanner;

public class PrintTable {
	
	
	static void printTable(int num) {
		
		for(int i=1; i<=10; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = sc.nextInt();
		
		printTable(n);

	}

}
