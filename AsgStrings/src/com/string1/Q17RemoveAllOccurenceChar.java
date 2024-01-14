package com.string1;
//17.	Write a Java program to remove all occurrences of a character from string. replaceALL()
public class Q17RemoveAllOccurenceChar {

	public static void deleteAllOccurrenceOfCharacter(String str, char delChar) {
		
		str = str.toLowerCase();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<str.length(); i++){
			
			if(str.charAt(i) !=delChar) {
				
				sb.append(str.charAt(i));
			}
		}
		System.out.println("Final String after removing all occurrences of Char "+delChar+" : "+sb);
	}
	
	public static void main(String[] args) {
		
		String str = "Banana"; 
		
		System.out.println("Original String : "+str);
		
		char delChar = 'a';
		deleteAllOccurrenceOfCharacter(str, delChar);

	}

}
