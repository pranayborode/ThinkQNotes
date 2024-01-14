package com.string1;

//23.	Write a Java program to find reverse of a string.
public class Q23StringReverse {
	
	static void findreverse(String s1) {
	
		String s2 = "";
		for(int i = s1.length()-1; i>=0; i--) {
			
			//System.out.print(s1.charAt(i));
			s2 = s2+s1.charAt(i);
		}
		
		System.out.println(s2);
		
	}
	
	

	public static void main(String[] args) {
		
		String s1 = "Good Morning";
		findreverse(s1);

	}

}
