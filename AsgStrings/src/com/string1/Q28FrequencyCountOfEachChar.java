package com.string1;

//28.	Write a Java program to count frequency of each character in a string.
public class Q28FrequencyCountOfEachChar {

	
	public static void findFreqCountOfEachChar(String str) {
		
		str = str.toLowerCase();
		
		//char strArray[] = str.toCharArray();
		
		int count;
		boolean status;
		
		for(int i = 0; i<str.length(); i++) {
			
			count = 1; 
			status = false;
			
			if (str.charAt(i) == ' ') {
				continue;
			}
			for(int j= i-1; j>=0; j--) {
			
				if(str.charAt(i)==str.charAt(j)) {
					status = true;
					break;
				}
			}
			if(!status) {
				for(int k = i+1; k<str.length(); k++) {
					
					if(str.charAt(i) == str.charAt(k)) {
						count++;
					}
				}
				System.out.println(str.charAt(i)+" : "+count);
			}
			
			
			
		}
	}
	
	public static void main(String[] args) {
		
		String str = "I Love java programming";
		findFreqCountOfEachChar(str);

	}

}
