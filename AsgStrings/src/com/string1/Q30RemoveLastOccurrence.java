package com.string1;

//30.	Write a Java program to remove last occurrence of a character from string.
public class Q30RemoveLastOccurrence {

	public static void removeLastOccurrence(String str, char ch) {
		
		str = str.toLowerCase();
		
		int lastIndexChar = str.lastIndexOf(ch);
		String newStr = "";
		
		for(int i= 0; i<str.length(); i++) {
			
			if (i != lastIndexChar) {
				newStr += str.charAt(i);
			}
		}
		if(lastIndexChar != -1) {
			System.out.println("New String : "+newStr);
		}else {
			System.out.println("Target character not found");
		}
		
	}
	
	public static void main(String[] args) {
		
		String str = "I love java Programming";
		
		System.out.println("Original String : "+str);
		char ch = 'i';
		
		removeLastOccurrence(str, ch);

	}

}
