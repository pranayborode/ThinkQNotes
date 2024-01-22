package com.logical;

public class IncodeString {

	public static void replaceVowels(String s) {
		
		char c[] = s.toCharArray();
		
		for(int i =0; i<c.length; i++) {
			
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'|| c[i]=='o'||c[i]=='u'
					||c[i]=='A'||c[i]=='E'||c[i]=='I'|| c[i]=='O'||c[i]=='U') {
				
				c[i] = '#';
			}
		}
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		String st = "Education";
		System.out.println(st);
		
		replaceVowels(st);
		
		System.out.println(st);

	}

}
