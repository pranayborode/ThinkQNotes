package com.string2;

//7. Change the case of the vowels
public class Q7ChangeCaseOfVowels {

	public static void chnageCaseOfVowels(String str) {
		char charArray[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {

			char ch1 = str.charAt(i);
			if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A' || ch1 == 'E'
					|| ch1 == 'I' || ch1 == 'O' || ch1 == 'U') {

				if (Character.isLowerCase(charArray[i])) {
					charArray[i] = Character.toUpperCase(charArray[i]);
				} else {
					charArray[i] = Character.toLowerCase(charArray[i]);
				}

			}

		}
		System.out.println(charArray);
	}

	public static void main(String[] args) {

		String str = "I Love India";
		chnageCaseOfVowels(str);

	}

}
