package com.string1;

//14.	Write a Java program to find first occurrence of a word in a given string.
public class Q14FirstOccurrenceWord {

	public static void findFirstOccurrence(String st) {

		String word = "bells";

		int firstOccurrence = st.toLowerCase().indexOf(word);

		System.out.println(firstOccurrence);

	}

	public static void main(String[] args) {

		String str = "Jingle bells jingle bells jingle all the way";

		findFirstOccurrence(str);
	}

}
