package com.ifelse;

import java.util.Scanner;

public class GradingLadder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Percentage");

		float per = sc.nextFloat();
		char grade;

		if (per >= 90)
			grade = 'A';
		else if (per >= 75)
			grade = 'B';
		else if (per >= 60)
			grade = 'C';
		else if (per >= 40)
			grade = 'D';
		else
			grade = 'F';
		if (grade == 'F')
			System.out.println("You have failed the exam");
		else
			System.out.println("Congratulations !..You have pass the exam with grade : " + grade);

	}

}
