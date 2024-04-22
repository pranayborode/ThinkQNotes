package com.lab2;

import java.util.Scanner;

public class GradeRemark {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Gread");
		
		int gread = sc.next().charAt(0);

		switch (gread) {
		case 'A':
		case 'a':	
			   System.out.println("Excelent");
			   break;

	    
		case 'B':
		case 'b':	
				System.out.println("Good");
				break;
				
		
		case 'C':
		case 'c':	
				System.out.println("Average");
				break;
				
		
		case 'D':
		case 'd':	
			    System.out.println("Poor");		
			    break;
			
		default: System.out.println("Enter valid input");

		}
		sc.close();

	}
}
		