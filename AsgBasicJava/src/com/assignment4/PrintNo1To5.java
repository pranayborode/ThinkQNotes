package com.assignment4;

import java.util.Scanner;

public class PrintNo1To5 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to print: ");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println("1 - One");
			break;
		case 2:
			System.out.println("2 - Two");
			break;
		case 3:
			System.out.println("3 - Three");
			break;
		case 4:
			System.out.println("4 - Four");
			break;
		case 5:
			System.out.println("5 - Five");
			break;	
		default:
			System.out.println("Enter valid input");
		}

	}

}
