package com.string1;

//10.	Write a Java program to find first occurrence of a character in a given string.
public class Q10FirstOccurrenceOfCharacter {

	public static void findFirstOccurrence(String s1) {

		char ch = 'o';

		int firstOcrIndex = s1.indexOf(ch);

		if (firstOcrIndex != -1) {
			System.out.println("First Occerance of " + ch + " is at index :" + firstOcrIndex);
		} else {
			System.out.println("Target Character not found");
		}

	}

	public static void main(String[] args) {

		String s1 = "Good Morning";

		findFirstOccurrence(s1);

	}

}
