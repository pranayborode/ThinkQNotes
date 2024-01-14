package com.string1;

public class Q41CountCharacters {

	public static void countCharacter(String str) {

		int alphabetsCount = 0;
		int digitsCount = 0;
		int specialCharactersCount = 0;

		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLetter(ch)) {
				alphabetsCount++;
			} else if (Character.isDigit(ch)) {
				digitsCount++;
			} else if (!Character.isWhitespace(ch)) {
				specialCharactersCount++;
			}
		}

		System.out.println("Total Alphabets: " + alphabetsCount);
		System.out.println("Total Digits: " + digitsCount);
		System.out.println("Total Special Characters: " + specialCharactersCount);
	}

	public static void main(String[] args) {

		String str = "India - 1947";

		countCharacter(str);

	}

}
