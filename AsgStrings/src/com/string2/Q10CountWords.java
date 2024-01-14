package com.string2;

//10. Count the words
public class Q10CountWords {
	
	public static void countWords(String str) {
		
		String s[] = str.split("\\s");
		int count=0;
		
		for(int i=0; i<s.length; i++) {
			
			count++;
		}
		
		System.out.println("Number of Words : "+count);
	}

	public static void main(String[] args) {
		
		String str = "Java is a popular programming language";
		countWords(str);

	}

}
