package com.string1;

//13.	Write a Java program to count total number of words in a string.
public class Q13CountTotalNoOfWords {

	static int countWords(String s1) {

		int count = 0;

		char ch[] = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {

			ch[i] = s1.charAt(i);

			if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {

				count++;

			}

		}
		return count++;

	}

	public static void main(String[] args) {

		String s1 = "  India is my country";

		System.out.println(countWords(s1) + " words");

	}

}
