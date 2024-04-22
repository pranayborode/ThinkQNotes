package com.lab9;

import java.util.Scanner;

public class PrintPattern1 {

	public static void printPattern(int row) {

		int temp = 1;
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= row; j++) {

				System.out.print(temp);
				if (temp == 1) {

					temp = 0;
				} else {

					temp = 1;
				}

			}
			System.out.println();

		}

//		for(int i = 1; i<=row; i++) {
//			int num;
//			if(i % 2 ==0) {
//				num = 0;
//				for(int j = 1; j<= row; j++) {
//					System.out.print(num+" ");
//					if(num == 0) {
//						num = 1;
//					}else {
//						num = 0;
//					}
//				}
//			}else {
//				
//				num = 1;
//				for(int j = 1; j<= row; j++) {
//					System.out.print(num+" ");
//					if(num == 0) {
//						num = 1;
//					}else {
//						num = 0;
//					}
//				}
//			}
//			System.out.println();
//		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows : ");

		int row = sc.nextInt();

		printPattern(row);

		sc.close();
	}

}
