package com.string1;

//21.	Write a Java program to toggle case of each character of a string.
public class Q21ToggleCase {

	static void toggleCase(String s1) {
		
		String s2 = "";
		
		for(int i = 0; i<s1.length(); i++) {
			
			if(Character.isUpperCase(s1.charAt(i))) {
				s2 = s2+Character.toLowerCase(s1.charAt(i));
			}else {
				s2 = s2+Character.toUpperCase(s1.charAt(i));
			}
		}
		
		System.out.println("Toggle String is : "+s2);
	}
	
	public static void main(String[] args) {
		
		String s1 = "jAVaProGram";
		System.out.println("Input String : "+s1);
		toggleCase(s1);
	}

}
