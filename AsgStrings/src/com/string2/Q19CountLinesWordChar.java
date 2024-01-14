package com.string2;

//19.Count the number of lines, word, characters from a string
public class Q19CountLinesWordChar {

	public static void countLineWordsChar(String str) {

		int lines = 0;
		int words = 0;
		int characters = 0;

		boolean status = false;

		char chArr[] = str.toCharArray();
		for (char ch : chArr) {
			characters++;

			if (ch == '\n') {
				lines++;
			}

			if (ch == ' ' || ch == '\n' || ch == '\t') {
				status = false;
			} else if (!status) {
				status = true;
				words++;
			}
		}
		if (Character.isLetterOrDigit(str.charAt(str.length() - 1))) {
			words++;
		}

		System.out.println("Lines: " + lines);
		System.out.println("Words: " + words);
		System.out.println("Characters: " + characters);
	}

	public static void main(String[] args) {

		String str = "This is a sample text.\nIt has multiple lines.\nAnd some words.";
		countLineWordsChar(str);

	}

}
