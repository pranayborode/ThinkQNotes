package com.wordslogical;

import java.util.Arrays;

public class DivideStringEqual {

	static void divideString(String s, int no0fC) {

		int len = s.length();
		if (len % no0fC != 0) {
			System.out.println("Cannot divide in equal parts...");
		} else {
			// number of substring
			int n = len / no0fC;
			String spltstr[] = new String[n];
			int index = 0;
			for (int i = 0; i < s.length(); i += no0fC) {
				spltstr[index] = s.substring(i, i + no0fC);
				index++;
			}
			System.out.println(Arrays.toString(spltstr));
		}
	}

	public static void main(String[] args) {
		String arr[] = { "I", "am", "very", "smart" };

		String s1 = String.join("", arr);

		int noOfChars = 4;

		divideString(s1, noOfChars);

	}

}
