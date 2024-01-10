package com.assignment3;

import java.util.Scanner;

// 2. Write a Java program to check whether a number is divisible by 5 and 11 or not 

public class DivisibleNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		if(num%5 ==0 && num%11 ==0) {
			System.out.println(num+" is dividible by 5 and 11");
		}else {
			System.out.println(num+" is Not dividible by 5 and 11");	
		}

	}

}
