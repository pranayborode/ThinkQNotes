package com.lab2;

import java.util.Scanner;

public class SizeOfTshirt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Tshirt Size");
		
		int size = sc.nextInt();
		
		switch(size) {
		
		case 30:
		case 31:
		case 32:
		case 33:
		case 34:
			System.out.println("Samll Size");
		    break;
		case 35:
		case 36:
		case 37:
			System.out.println("Medium Size");
		    break;    
		    
		case 38:
		case 39:
		case 40:
			System.out.println("large Size");
		    break;    
		
		case 41:
		case 42:
		case 43:
		case 44:	
			System.out.println("Extra large Size");
		    break;  
		default: System.out.println("Enter your size of Tshirt with in the range 30 to 44");    
		
		
		}
		

	}

}
