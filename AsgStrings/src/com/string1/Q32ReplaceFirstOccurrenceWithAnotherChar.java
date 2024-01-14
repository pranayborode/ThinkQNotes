package com.string1;

//32.	Write a Java program to replace first occurrence of a character with another in a string.
public class Q32ReplaceFirstOccurrenceWithAnotherChar {

	public static void removeFirstOccWithAnother1(String str, char charToReplace, char repChar) {

		str = str.toLowerCase();
		int index = str.indexOf(charToReplace);
		String newStr = "";

		if (index != -1) {
			System.out.println(str.substring(0, index) + repChar + str.substring(index + 1));
		} else {
			System.out.println("Target Character not found");
		}

	}
	
	public static void removeFirstOccWithAnother2(String str, char charToReplace, char repChar) {

		str = str.toLowerCase();
		
		char charArray [] = str.toCharArray();
		
		for(int i = 0; i<charArray.length; i++) {
			
			if(charArray[i] == charToReplace) {
				
				charArray[i] = repChar;
				break;
			}
			
		}

		System.out.println(charArray);
		

	}

	public static void main(String[] args) {

		String str = "I love java programming";

		char charToReplace = 'o';
		char replacementChar = '#';

		removeFirstOccWithAnother1(str, charToReplace, replacementChar);
		System.out.println("----------------------------");
		removeFirstOccWithAnother2(str, charToReplace, replacementChar);
	}

}
