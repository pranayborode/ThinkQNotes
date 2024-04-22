package com.lab2;

import java.util.Scanner;

public class ShowGender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter YOur Gender M or F");
		char gender = sc.next().charAt(0);

		switch (gender) {
		case 'F':
		case 'f':
			System.out.println("You are Female");
			break;
		case 'M':
		case 'm':
			System.out.println("You are Male");
			break;
		default:
			System.out.println("Enter correct Option");
		}
		sc.close();

	}

}
