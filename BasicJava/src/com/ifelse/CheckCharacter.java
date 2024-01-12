package com.ifelse;

import java.util.Scanner;

public class CheckCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Character");

		char ch = sc.next().charAt(0);

		if (Character.isAlphabetic(ch)) {
			System.out.println("Given character is Letter");
		} else {
			System.out.println("Given character is Number");
		}

	}

}
