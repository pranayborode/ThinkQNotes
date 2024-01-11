package com.assignment5;

import java.util.Scanner;

//8.	 Write a Java program to count number of digits in any number

public class Q8CountDigits {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter Number");
		int num = sc.nextInt(); 
		int count =0;
		int rem;
		
		for (int i =1; i<=num ; i++) {
			 if(num>0) {
				 rem = num % 10;
				 num = num/10;
				 count++;
			 }else {
				break;
			}
		}
		System.out.println(count);

	}
	

//	public static void freqDigit(int num) {
//		
//		int count =0;
//		do{
//			
//			count++;
//			num /=10;
//			
//			
//		}while (num != 0);
//		System.out.println(count);
//	}
//	
//	public static void main(String[] args) {
//		
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Eenter a number :");
//		int n = sc.nextInt();
//		
//		freqDigit(n);
//		
//	}

}
