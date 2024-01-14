package com.string1;



//36.	Write a Java program to search all occurrences of a word in given string.
public class Q36AllOccurrenceOfWord {

	
	public static void findAllOccurrenceOfWord(String str, String word) {
		
		str = str.toLowerCase();
		
		String newStrArray[] = str.split("\\s");
		
		
		
		for(int i=0; i<newStrArray.length; i++) {
			
			if(word.equals(newStrArray[i])) {
				
				System.out.println(word + " found at index: " + i);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		

		String str = "Jingle bells jingle bells jingle all the way";

		String word = "jingle";
		
		findAllOccurrenceOfWord(str, word);

	}

}
