package com.string1;

//19.	Write a Java program to trim both leading and trailing white space characters in a string.
public class Q19TrimBothLeadingTrailing {
	
	static void trimString(String s1) {
		
		s1 = s1.trim();
		
		System.out.println(s1);
	}

	public static void main(String[] args) {
		
		String s1 = "   India     ";
		
		trimString(s1);
		
	}
}
