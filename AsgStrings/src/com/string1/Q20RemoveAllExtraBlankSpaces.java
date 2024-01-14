package com.string1;

//20.	Write a Java program to remove all extra blank spaces from a given string.
public class Q20RemoveAllExtraBlankSpaces {

	static void removeBlankSpaces(String s1) {
		
		s1 = s1.replaceAll("\\s+", " ");  //  \\s+ replace multiple spaces with single space
		System.out.println(s1);
	}
	
	public static void main(String[] args) {
		
		String s1 = "   India    is  my country";
		
		removeBlankSpaces(s1);  //India is my country

	}

}
