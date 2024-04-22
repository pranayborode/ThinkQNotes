package com.lab10;

import java.util.Scanner;


public class PrintPattern2 {

	public static void printPattern(int row) {
		
		int letter = 65;
		for(int i = 1; i<=row; i++) {
			
			for(int j = i; j>=1; j--) {
				
				System.out.print((char)letter+" ");
				letter++;
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. of Rows");
		int row = sc.nextInt();

		printPattern(row);
		
		sc.close();
	}

}
