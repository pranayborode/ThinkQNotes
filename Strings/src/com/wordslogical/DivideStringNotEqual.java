package com.wordslogical;

import java.util.Arrays;

public class DivideStringNotEqual {

	static void divideString(String s, int no0fC) {

		int len = s.length();
		if (len % no0fC != 0) {
			
			//remainder  - extra char
			int x = no0fC -(len%no0fC);
			for(int i = 0; i<x; i++) {
				s = s.concat("#");
			}
		}
		
		{
			len = s.length();
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

		int noOfChars = 5;

		divideString(s1, noOfChars);

	}

}
