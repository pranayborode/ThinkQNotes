package com.string1;

//11.	Write a Java program to count occurrences of a character in given string.
public class Q11CountOccurrencesOfCharacter {

	public static void countOccurrance(String s1) {
		char search = 'a';
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == search) {
				count++;
			}

		}
		System.out.println("Character " + search + " --> " + count);
	}

	public static void main(String[] args) {

		String s1 = "aabcdabdebcda";

		countOccurrance(s1);
	}

}
