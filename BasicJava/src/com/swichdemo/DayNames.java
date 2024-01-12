package com.swichdemo;

import java.util.Scanner;

public class DayNames {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Day Number");
		
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
			System.out.println("Thrusday");
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
			
			default : System.out.println("Enter valid input");
		}
		sc.close();
	}

}
