package com.string1;

import java.util.Scanner;

//33.	Write a Java program to replace last occurrence of a character with another in a string.
public class Q33ReplaceLastOccurrenceChar {

	public static void replaceLastOccurrence(String str, char charToReplace, char repChar) {

		str = str.toLowerCase();
		char newChar[] = str.toCharArray();

		for (int i = str.length() - 1; i >= 0; i--) {

			if (newChar[i] == charToReplace) {
				newChar[i] = repChar;
				break;

			}
		}
		System.out.println(newChar);
	}

	public static void main(String[] args) {

		String str = "I love java programming";

		char charToReplace = 'o';
		char replacementChar = '#';

		replaceLastOccurrence(str, charToReplace, replacementChar);
	}

}
