package com.string1;

//25. Write a Java program to find last occurrence of a character in a given string.
public class Q25LastOccurrenceCharacter {

	static void lastCharacter(String s) {
		
		char ch = 'n';
		
		int lastOcrIndex = s.lastIndexOf(ch);
		
		//System.out.println(lastOcrIndex);
		
		if(lastOcrIndex != -1) {
			
			System.out.println("Last Occerance of "+ch+" is at index :"+lastOcrIndex);
		}else {
			System.out.println("Target Character not found");
		}
	}
	
   public static void main(String[] args) {
	String s1 = "Good Morning";
	
	lastCharacter(s1);
}
}
