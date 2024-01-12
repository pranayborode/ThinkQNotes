package com.ifelse;

import java.util.Scanner;

public class IfElseOr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total percentage");
		double totalPer = sc.nextDouble();
		
		System.out.println("Enter percentage of best 4 subjects");
		double best4Sub = sc.nextDouble();
		
		if((totalPer > 75)|| (best4Sub >80)) {
			System.out.println("Congratulations...You are eligible for college admission");
		}else {
			System.out.println("Sorry !..Better luck next time.");
		}
		sc.close();

	}

}
