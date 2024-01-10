package com.assignment3;

import java.util.Scanner;

//2. Write a Java program to input any character and check whether it is alphabet, digit or special character

public class CharacterCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Character");

		char ch = sc.next().charAt(0);

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("The Character is Alphabet");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("The Character is digit");
		} else {
			System.out.println("The Character is special character");
		}
		sc.close();

	}

}
