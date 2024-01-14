package com.string1;

//18.	Write a Java program to trim trailing white space characters in a string.
public class Q18TrimTrailingWhiteSpace {

	static void trimTrailingWhiteSpace(String s1) {
		int endIndex = s1.length()-1;

		while (endIndex >=0 && Character.isWhitespace(s1.charAt(endIndex))) {
			endIndex--;
		}

		System.out.println(s1.substring(0,endIndex+1));

	}
	
	public static void main(String[] args) {
		String s1 = "   India     ";
		
		trimTrailingWhiteSpace(s1);

	}

}
