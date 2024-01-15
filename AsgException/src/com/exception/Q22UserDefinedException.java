package com.exception;

import java.util.Scanner;

//22. WAP to create user defined Exception and catch the exception.  

public class Q22UserDefinedException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name: ");

		String name = sc.next();

		try {

			if (name.length() < 3)
				throw new InvalidNameException("Name must be greater than 2 character");
			System.out.println("Welcome : " + name);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
