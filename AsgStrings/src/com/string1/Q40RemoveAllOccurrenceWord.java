package com.string1;


//40.	Write a Java program to remove all occurrence of a word in given string.
public class Q40RemoveAllOccurrenceWord {

	public static void removeAllOcurrence(String str, String wordToRemove) {

		String strArr[] = str.split("\\s");
		
		String newStr = "";
		
		for(int i =0; i<strArr.length;i++) {
			
			
			if(!strArr[i].equals(wordToRemove)) {
				
				newStr += strArr[i]+" ";
			}
		}

		System.out.println(newStr);
		

	}
	
	public static void main(String[] args) {
		
		String str = "If you think you have a good idea then try it";

		String wordToRemove = "you";
		removeAllOcurrence(str, wordToRemove);

	}

}
