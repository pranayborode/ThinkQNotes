package com.logical;

public class Anagram1 {
	
	public static void sortArray(char ch[]) {
		
		for(int i = 0; i<ch.length; i++) {
			for(int j = i+1; j<ch.length; j++) {
				
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
	}
	
	public static boolean checkAnagram(String str1, String str2) {
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() != str2.length()) {
			return false;
		}else {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();
			
			sortArray(ch1);
			sortArray(ch2);
			
			//compare
			for(int i=0; i<ch1.length; i++) {
				if(ch1[i]!=ch2[i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String s1 = "Race";
		String s2 = "Care";
		
		if(checkAnagram(s1, s2)) {
			System.out.println(s1+"  "+s2+" : are anagram");
		}else {
			System.out.println(s1+"  "+s2+" : are not anagram");
		}

	}

}
