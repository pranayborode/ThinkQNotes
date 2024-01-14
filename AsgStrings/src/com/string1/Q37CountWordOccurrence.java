package com.string1;

//37.	Write a Java program to count occurrences of a word in a given string.
public class Q37CountWordOccurrence {

	public static void findCount(String str, String word) {

		str = str.toLowerCase();

		String newStrArray[] = str.split("\\s");

		int count = 0;

		for (int i = 0; i < newStrArray.length; i++) {

			if (word.equals(newStrArray[i])) {

				count++;
			}

		}
		System.out.println("The Occurrence of Word Count is : " + count);

	}

	public static void main(String[] args) {
		String str = "Jingle bells jingle bells jingle all the way";

		String word = "jingle";

		findCount(str, word);

	}

}
