package com.string2;

import java.util.Arrays;

//5. replace all the vowels with special symbol
public class Q5ReplaceVowels {

	public static void replaceAllVowels(String str, char specialSymbol) {

		str = str.toLowerCase();
		char charArray[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
				charArray[i] = specialSymbol;
			}
		}

		String s1 = new String(charArray);
		System.out.println("New String     :" + s1);
	}

	public static void main(String[] args) {

		String str = "I love india";

		System.out.println("Original String: " + str);
		char specialSymbol = '#';
		replaceAllVowels(str, specialSymbol);
	}

}
