package com.string2;

//2. Count frequency of characters
public class Q2CountFrequencyOfCharacters {

	public static void findFreqChar(char ch[]) {
		
		
		for(int i = 0; i< ch.length; i++) {
			int count = 1;
			
			if(ch[i] == '\0') {
				
				continue;
			}
			
			
			for(int j = i+1; j<ch.length; j++) {
				
				
				
				if(ch[i] == ch[j]) {
					
					count++;
					ch[j] ='\0';
				}
			}
			System.out.println(ch[i]+"-->"+count);
		}
	}
	
	public static void main(String[] args) {
		
		char ch[] = {'a', 'b', 'd', 'a', 'c', 'b', 'a'};
		
		findFreqChar(ch);

	}

}
