package com.string1;

//26.	Write a Java program to find highest frequency character in a string.
public class Q26HigestFreqCharacter {

	static void findHigestFreq(String str) {

		int count;
		int maxCount = 0;
		char maxFreqChar = ' ';
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {
				continue;
			}
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}

				if (count > maxCount) {
					maxCount = count;
					maxFreqChar = str.charAt(i);

				}
			}

		}
		System.out.println("Higest frequency Character is " + maxFreqChar + " : " + maxCount);

	}

	public static void main(String[] args) {

		String str = "Higest frequency Character";
		findHigestFreq(str);
	}

}
