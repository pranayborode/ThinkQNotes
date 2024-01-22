package com.basic;

public class StringImmutable {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java";  //SCP
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1.concat("Program"); 
		// Here program is only created in heap area and not in SCP 
		// because concat returns string which is created in heap only
		
		System.out.println(s1);
		
		String s3 = "JavaProgram";
		
		s1 = s1+"Program";
		System.out.println(s1);
	}

}
