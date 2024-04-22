package com.labString;

public class Pattern2 {

	public static void printPattern(String str) {
		
		int sp1 = str.indexOf(' ');
		int sp2 = str.lastIndexOf(' ');
		int len = str.length();
		
		System.out.println(str.charAt(0)+"."+str.charAt(sp1+1)+"."+str.charAt(sp2+1)+".");
		System.out.println(str.charAt(0)+"."+str.charAt(sp1+1)+"."+str.substring(sp2+1,str.length() ));
		System.out.println(str.substring(sp2+1,str.length())+" "+ str.substring(0, sp1)+" "+str.substring(sp1+1, sp2));
		
	}

	public static void main(String[] args) {

		String str = "Sachin Ramesh Tendulkar";
		printPattern(str);

	}

}
