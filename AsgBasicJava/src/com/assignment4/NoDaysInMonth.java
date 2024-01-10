package com.assignment4;

import java.util.Scanner;

//1. Write a Java program print total number of days in a month using switch case 

public class NoDaysInMonth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Month No");
		int monthNo = sc.nextInt();

		switch (monthNo) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			System.out.println("31 Days");
			break;
		}

		case 4:
		case 6:
		case 9:
		case 11: {
			System.out.println("30 Days");
			break;
		}
		case 2: {
			System.out.println("Enter any Year");
			int year = sc.nextInt();
			if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
				System.out.println("29 Days");
			} else {
				System.out.println("28 Days");
			}
			break;
		}

		default:
			System.out.println("Error");
		}

		sc.close();

	}

}
