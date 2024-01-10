package com.assignment3;

import java.util.Scanner;

//9. Write a Java program print total number of days in a month 
public class DaysInMonth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter month (1-12)");

		int month = sc.nextInt();

		if (month >= 1 && month <=12) {
			
			if (month == 2) {
				System.out.println("Total Number of Days in selected month : 28");
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				System.out.println("Total Number of Days in selected month : 30");
			}else {
				System.out.println("Total Number of Days in selected month : 31");
			}
		}else {
			System.out.println("Enter valid month between 1 to 12");
		}

	}

}
