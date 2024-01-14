package com.string1;

//31.	Write a Java program to remove all repeated characters from a given string.
public class Q31RemoveAllRepeatedChar {

	public static void removeDuplicate(String str) {

		str = str.toLowerCase();

		String newStr = new String();

		for (int i = 0; i < str.length(); i++) {

			char charAtPosition = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {

				if (newStr.indexOf(charAtPosition) < 0) {
					newStr += charAtPosition;
				}
			}

		}
		System.out.println(newStr);

	}

	public static void main(String[] args) {

		String str = "If you think you have a good idea then try it";

		removeDuplicate(str);

	}

}
