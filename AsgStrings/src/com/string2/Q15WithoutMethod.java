package com.string2;

import java.util.Arrays;

//15. Length, concat, reverse w.o method
public class Q15WithoutMethod {

	public static int calcLength(String str) {

		int length = 0;

		char chArray[] = str.toCharArray();

		for (char i : chArray) {

			length++;
		}

		return length;
	}

	public static void reverseString(String str) {

		int len = calcLength(str);

		char chArray[] = str.toCharArray();
		char revArray[] = new char[len];

		for (int i = 0; i < len; i++) {

			revArray[i] = chArray[len - 1 - i];

		}
		System.out.println(revArray);

	}

	public static void concatStrings(String str1, String str2) {

		char chArr[] = new char[str1.length() + str2.length()];

		for (int i = 0; i < str1.length(); i++) {
			chArr[i] = str1.charAt(i);
		}

		for (int j = 0; j < str2.length(); j++) {
			chArr[str2.length() + j] = str2.charAt(j);
		}
		
		System.out.println(chArr);
	}

	public static void main(String[] args) {

		String str1 = "Good Morning";
		String str2 = " How are you";

		System.out.println("Length of String: " + calcLength(str1));

		reverseString(str1);

		concatStrings(str1, str2);
	}

}
