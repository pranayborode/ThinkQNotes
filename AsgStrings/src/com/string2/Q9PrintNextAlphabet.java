package com.string2;

//9. print next alphabet of each character
//   Java - Kbwb

public class Q9PrintNextAlphabet {

	public static void printNextAlphabet(String str) {

		char chArray[] = str.toCharArray();

		for (int i = 0; i < chArray.length; i++) {
			char ch = chArray[i];
			chArray[i] = (char) (ch + 1);
		}
		System.out.println(chArray);
	}

	public static void main(String[] args) {

		String str = "Java";
		printNextAlphabet(str);

	}

}
