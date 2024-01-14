package com.string1;

//12.	Write a Java program to trim leading white space characters in a string.
public class Q12TrimLeadingWhiteSpace {

	static void trimLeadingWhiteSpace(String s1) {
		int startIndex = 0;

		while (startIndex < s1.length() && Character.isWhitespace(s1.charAt(startIndex))) {
			startIndex++;
		}

		System.out.println(s1.substring(startIndex));

	}

	public static void main(String[] args) {

		String s1 = "   India     ";

		trimLeadingWhiteSpace(s1);
	}

}
