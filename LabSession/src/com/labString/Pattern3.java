package com.labString;

// given string "coumputer is fun" required ans "fun is computer"
public class Pattern3 {
	
	public static void printPattern1(String s) {
		
	String s1 = "";
	String s2 = "";
	
	int sp1 = s.indexOf(' ');
	int sp2 = s.lastIndexOf(' ');
	
	s1 = s1+s.substring(sp2+1, s.length());
	s2 = s1+s.substring(sp1, sp2+1);
	s2 = s2+s.substring(0, sp1);
	
	System.out.println(s2);
	
	}
	
	public static void printPattern2(String s) {
		
		String word[] = s.split(" ");
		
		for(int i=word.length-1; i>=0; i--) {
			
			System.out.print(word[i]+" ");
		}
	}
	
	public static void printPattern3(String s){
		
		String str1 = "";
		String word[] = s.split(" ");
		
		for(int i=word.length-1; i>=0; i--) {
				str1 = str1+word[i]+" ";
		}
		System.out.print(str1);
	}

	public static void main(String[] args) {
		
		String str = "coumputer is fun";
		
		printPattern1(str);
		printPattern2(str);
		System.out.println();
		printPattern3(str);
		
		

	}

}
