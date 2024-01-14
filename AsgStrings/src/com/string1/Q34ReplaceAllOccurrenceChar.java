package com.string1;

//34.	Write a Java program to replace all occurrences of a character with another in a string.
public class Q34ReplaceAllOccurrenceChar {

	public static void replaceAllOccurrence(String str, char charToReplace, char repChar) {

		str = str.toLowerCase();
		char newChar[] = str.toCharArray();

		for (int i = 0; i < newChar.length; i++) {

			if (newChar[i] == charToReplace) {
				newChar[i] = repChar;

			}
		}
		System.out.println(newChar);
	}

	public static void main(String[] args) {

		String str = "banana";

		char charToReplace = 'a';
		char replacementChar = '#';

		replaceAllOccurrence(str, charToReplace, replacementChar);
	}

}
