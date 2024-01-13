package com.assignment19array1;

import java.util.Scanner;
public class Q20TableArray {

	public static int[] printTableArray(int num) {
		
		int [] table = new int[10];
		
		for(int i = 0; i<table.length; i++) {
			
			table[i] = num *(i+1);  // table[0] = 3*(0+1) = 3
		}
		return table;
	}
	
	public static void displayArray(int []array) {
		for(int value : array) {
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		
		int num = sc.nextInt();
		
		
		int[]tabel = printTableArray(num);
		
		System.out.println("Table of "+num+" :");
		
		displayArray(tabel);
		Math.sqrt(num);

	}

}
