package com.labString;

public class PatternHello {

	public static void printPattern(String str) {
		
		for(int i = 0; i<str.length(); i++) {
			
			System.out.println(str.subSequence(0, i+1));
		}
	}
	
	public static void main(String[] args) {
		
		String str = "hello";

		printPattern(str);
	}

}
