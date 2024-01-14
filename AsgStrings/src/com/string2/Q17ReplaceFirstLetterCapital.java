package com.string2;

//17. Replace the first letter of every word with capital
// I  love my india  : I Love My India
public class Q17ReplaceFirstLetterCapital {

	public static void replaceFirstLetter(String str) {

		String words[] = str.split("\\s");

		String newStr = "";

		for (String w : words) {

			String first = w.substring(0, 1);

			String rest = w.substring(1);

			newStr += first.toUpperCase() + rest + " ";
		}

		System.out.println(newStr.trim());
	}

	public static void main(String[] args) {

		String str = "I love my india";
		replaceFirstLetter(str);

	}

}
