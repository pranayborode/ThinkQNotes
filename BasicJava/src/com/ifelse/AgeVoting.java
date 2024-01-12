package com.ifelse;

import java.util.Scanner;

public class AgeVoting {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		
		if(age >=18) {
			System.out.println("You are eligible for voting");
		}else {
			System.out.println("You are Not eligible for voting");
		}
		
		sc.close();
		
	}

}
