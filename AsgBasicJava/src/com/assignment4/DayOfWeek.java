package com.assignment4;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number 1-7 : ");
		
		int dayNo = sc.nextInt();
		
		switch(dayNo) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;	
			
		default: System.out.println("Error, Day does not exist");	
		}
		sc.close();
		
	}

}
