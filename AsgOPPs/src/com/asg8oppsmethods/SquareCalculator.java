package com.asg8oppsmethods;

import java.util.Scanner;

public class SquareCalculator {

	Scanner sc = new Scanner(System.in);

	public void calcSqNoReturn() {

		System.out.print("Enter Number : ");

		int num = sc.nextInt();
		int square = num * num;

		System.out.println("Square with no return type : " + square);
	}

	public double calcSqWithReturn() {
		
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		return num * num;
	}

	public double calcSqWithParaReturn(int num) {
		return num * num;
	}


	public static void main(String[] args) {

		SquareCalculator s1 = new SquareCalculator();
		
		s1.calcSqNoReturn();
		
		System.out.println("Square with return type : "+ s1.calcSqWithReturn());
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("Square with Parameter and Return type : "+s1.calcSqWithParaReturn(num));
		
		sc.close();
		
	}

}
