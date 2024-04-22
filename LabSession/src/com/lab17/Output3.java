package com.lab17;

public class Output3 {

	public static void main(String[] args) {
	
		String s1 = "CrimsonRed";
		String s2 = s1.intern();
		
		if(s1.equals(s2)) {
			s2 = s2.substring(6, s1.length());
		}else if(s1.length() == s2.length()) {
			s2= "Blue";
		}else if(s1.length() > s2.length()) 
			s2 = "White";
		else s2 = "Red";
		
		System.out.println(s1);
		System.out.println(s2);
	}
	
	

}
