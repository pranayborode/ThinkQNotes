package com.string1;

//29.	Write a Java program to remove first occurrence of a character from string.
public class Q29RemoveFirstOccurrence {

	public static void removeFirstOccurrence(String str, char ch) {

		str = str.toLowerCase();
		int firstOccIndex = str.indexOf(ch);
		String newStr = "";

		for (int i = 0; i < str.length(); i++) {

			if (i != firstOccIndex) {
				newStr += str.charAt(i);
			}

		}

		if (firstOccIndex != -1) {
			System.out.println(newStr);
		} else {
			System.out.println("Target Character not found");
		}

	}

	public static void main(String[] args) {

		String str = "I love java programming";

		char ch = 'a';

		removeFirstOccurrence(str, ch);
	}

}
