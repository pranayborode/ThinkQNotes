package com.labString;

public class MaxLengthOfWord {

	public static void findMaxlengthWord(String str) {

		String word[] = str.split(" ");

		String maxLenWord = word[0];

		for (int i = 0; i < word.length; i++) {

			if (word[i].length() > maxLenWord.length()) {

				maxLenWord = word[i];

			}

		}
		System.out.println(maxLenWord);

	}

	public static void main(String[] args) {

		String str = "i love java programming";
		findMaxlengthWord(str);
	}

}
