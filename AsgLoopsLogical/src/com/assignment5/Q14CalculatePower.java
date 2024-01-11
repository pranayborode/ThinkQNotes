package com.assignment5;

import java.util.Scanner;

//14.	WAP to accept base and index from user and calculates power
public class Q14CalculatePower {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Base :");
		double b = sc.nextLong();
		
		System.out.println("Enter Index :");
		double i = sc.nextLong();
		
		double power = Math.pow(i, b);
		System.out.println(power);

	}

}
