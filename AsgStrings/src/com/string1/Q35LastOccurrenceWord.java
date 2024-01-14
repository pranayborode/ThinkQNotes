package com.string1;

import java.util.Arrays;

//35.	Write a Java program to find last occurrence of a word in a given string.

public class Q35LastOccurrenceWord {

	public static void findLastOccurrenceWord(String str, String word) {

		str = str.toLowerCase();

		int lastWordIndex = str.lastIndexOf(word);

		if (lastWordIndex != -1) {
			System.out.println("Last occurrence of word " + word + " : " + lastWordIndex);
		} else {
			System.out.println("Target word not found");
		}
	}

	public static void main(String[] args) {

		String str = "Jingle bells jingle bells jingle all the way";

		String word = "jingle";
		findLastOccurrenceWord(str, word);
	}

}
