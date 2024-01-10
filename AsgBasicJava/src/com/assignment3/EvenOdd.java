package com.assignment3;

import java.util.Scanner;

//3. Write a Java program to check whether a number is even or odd 

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" is even number");
		}else {
			System.out.println(num+" is odd number");
		}
		sc.close();

	}

}
