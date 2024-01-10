package com.assignment4;

import java.util.Scanner;

public class StringTypeExpression {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Who are Eligible to Donate Blood?");
		System.out.println("Enter gender to donate blood");
		System.out.println("Male");
		System.out.println("Female");
		
		String gender = sc.next();
		
		switch(gender) {
		case "Male":
		case "male":
			System.out.println("Age between 18 and 60 years");
			System.out.println("Haemoglobin - not less than 12.5 g/Dl.");
			System.out.println("The minimum weight required 50Kg");
			break;
		case "Female":
		case "female":
			System.out.println("Age between 18 and 60 years");
			System.out.println("Haemoglobin - not less than 13.0 g/Dl.");
			System.out.println("The minimum weight required 45Kg");
			break;
		default: System.out.println("Enter valid gender");
		
		}

	}

}
