package com.ifelse;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Year");
		int year = sc.nextInt();
			
		if(((year%4 ==0)&&(year%100!=0)||(year%400==0))) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not a leap year");
		}
		sc.close();

	}

}
