package com.string1;

// 24.	Write a Java program to reverse order of words in a given string.
public class Q24ReverseWordsOrder {

	public static void reverseOrderOfString(String st) {

		
		String revSt[] = st.split("\\s");
		
		String newStr = "";

		for (int i = revSt.length - 1; i >= 0; i--) {
			
			newStr = newStr +  revSt[i]+" ";
		}
		System.out.println(newStr);
	}

	public static void main(String[] args) {

		String str = "my first java program - hello world";
		reverseOrderOfString(str);

	}

}
