package com.logical;

import java.util.Arrays;

public class Anagram2 {
	

	public static boolean checkAnagram(String str1, String str2) {
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() != str2.length()) {
			return false;
		}else {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(!Arrays.equals(ch1, ch2)) {
				return false;
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
