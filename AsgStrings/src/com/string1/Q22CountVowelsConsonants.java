package com.string1;

//22.	Write a Java program to count total number of vowels and consonants in a string.
public class Q22CountVowelsConsonants {
	
	public static void countVowelsConsonants(String s1){
		
		int vCount = 0;
		int cCount = 0;
		
		s1 = s1.toLowerCase();
		for(int i = 0; i<s1.length(); i++) {
			
			if(s1.charAt(i) == 'a' ||s1.charAt(i)=='e' || s1.charAt(i) =='i'|| s1.charAt(i)=='o'|| s1.charAt(i)=='u') {
				
				vCount ++;
			}else if (s1.charAt(i)>'a' && s1.charAt(i)<'z') {
				cCount ++;
			}
			
		}
		System.out.println("Number of vowels     :"+vCount);
		System.out.println("Number of consonants :"+cCount);
	}

	public static void main(String[] args) {

		String s1 = "Total number of vowels and consonants in a string";
		
		countVowelsConsonants(s1);
		
	}

}
