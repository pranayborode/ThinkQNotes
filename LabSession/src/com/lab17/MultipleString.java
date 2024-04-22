package com.lab17;

//String array has multiple strings in it. Create a new string which takes character at position at index
// of that string in array. Eg.string array is {"winter", "fall", "summer", "spring"}; output string should be "wami";

public class MultipleString {

	public static void findRequiredStringOutput(String str[]) {

		String newStr = "";
		int index = 0;

		for (int i = 0; i < str.length; i++) {

			newStr += str[i].charAt(index);
			index++;
		}
		System.out.println(newStr);

	}

	public static void main(String[] args) {

		String str[] = { "winter", "fall", "summer", "spring" };

		findRequiredStringOutput(str);
	}

}
