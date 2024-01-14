package com.string1;

//39.	Write a Java program to remove last occurrence of a word in given string.
public class Q39RemoveLastOccurrenceWord {

	public static String removeLastOccurrenceWord(String str, String word) {

		str = str.toLowerCase();
		int LastOccIndex = str.lastIndexOf(word);

		if (LastOccIndex != -1) {
			String newString = str.substring(0, LastOccIndex) + str.substring((LastOccIndex) + word.length());
			return newString;
		} else {
			return str;
		}
	}

	public static void main(String[] args) {
		String str = "Jingle bells jingle bells jingle all the way";

		String word = "way";

		String result = removeLastOccurrenceWord(str, word);
		System.out.println(result);

	}

}
