package com.string1;

//15.Write a Java program to search all occurrences of a character in given string.
public class Q15AllOccurrenceCharacter {

	public static void findAllOccurrenceOfAChar(String str, char ch) {
		int i = 0;

		str = str.toLowerCase();

		while (i < str.length()) {

			if (str.charAt(i) == ch) {

				System.out.println(ch + " found at index: " + i);

			}
			i++;
		}
	}

	public static void main(String[] args) {

		String str = "I love India";
		char ch = 'i';

		findAllOccurrenceOfAChar(str, ch);
	}

}
