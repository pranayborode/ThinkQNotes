package com.string1;

//9.	WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class Q9SplitString {

	static void splitString(String s1) {
		
		String s2 = "";
		char ch = '$';
		for(int i =0; i<s1.length(); i++) {
			
			if(ch ==s1.charAt(i) || i == s2.length()-1) {
				System.out.println(s2);
				s2 = "";
			}else {
				s2 +=s1.charAt(i);
			}
			
		}
		System.out.println(s2);
	}
	
	public static void main(String[] args) {
		
		String str = "HELLO$WORLD";
		
		
		String split1[] = str.split("\\$");
		
		for(String value: split1) {
			System.out.println(value);
		}
		
		splitString(str);
	}

}
