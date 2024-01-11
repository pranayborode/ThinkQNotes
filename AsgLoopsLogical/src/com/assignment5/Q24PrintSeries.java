package com.assignment5;

import java.util.Scanner;

public class Q24PrintSeries {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Terms");
		
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {     
			
			for(int j =1; j<=i; j++) {    
				System.out.print("1");    
			}
			System.out.print(" ");
				
		}
		

	}

}
