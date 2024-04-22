package com.lab9;

import java.util.Scanner;

// 1
// 1 #
// 1 # 1
// 1 # 1 #
// 1 # 1 # 1
public class PrintPattern2 {

	public static void printPattern(int row) {
		
		for(int i = 1; i<=row; i++) {
			
			for(int j = 1; j<=i; j++) {
				if(j%2 !=0) {
					System.out.print("1 ");
				}else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows : ");

		int row = sc.nextInt();

		printPattern(row);

		sc.close();

	}

}
