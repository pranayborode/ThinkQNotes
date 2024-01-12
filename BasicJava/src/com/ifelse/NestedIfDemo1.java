package com.ifelse;

import java.util.Scanner;

public class NestedIfDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age :");

		int age = sc.nextInt();

		if (age >= 18) {

			System.out.println("Enter Your weight :");
			float weight = sc.nextFloat();
			if (weight >= 50) {
				System.out.println("You can donate the Blood");
			} else {
				System.out.println("You are underweight and can't donate Blood");
			}
		} else {
			System.out.println("You are too young to donate Blood");
		}
		sc.close();

	}

}
