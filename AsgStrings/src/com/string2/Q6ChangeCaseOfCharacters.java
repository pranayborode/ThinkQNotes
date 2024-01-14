package com.string2;

//6. Change the case of all the character
//   JaVa- jAvA

public class Q6ChangeCaseOfCharacters {

	public static void changeCase(String str) {

		char charArray[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {

			if (Character.isLowerCase(charArray[i])) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			} else {
				charArray[i] = Character.toLowerCase(charArray[i]);
			}
		}
		String st = new String(charArray);

		System.out.println("New String     : " + st);
	}

	public static void main(String[] args) {

		String str = "JaVa";
		System.out.println("Original String: " + str);

		changeCase(str);

	}

}
