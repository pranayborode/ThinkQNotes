package com.string1;

//38.	Write a Java program to remove first occurrence of a word from string.
public class Q38RemoveFirstOccurrenceWord {

	public static String removeFirstOccurrenceWord(String str, String word) {

		str = str.toLowerCase();
		int firstOccIndex = str.indexOf(word);

		if (firstOccIndex != -1) {
			String newString = str.substring(0, firstOccIndex) + str.substring(firstOccIndex+ word.length());
			return newString;
		} else {
			return str;
		}
	}

	public static void main(String[] args) {

		String str = "Jingle bells jingle bells jingle all the way";

		String word = "jingle";

		String result = removeFirstOccurrenceWord(str, word);
		System.out.println(result);

	}

}
