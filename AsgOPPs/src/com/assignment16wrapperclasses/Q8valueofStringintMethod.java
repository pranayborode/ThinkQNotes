package com.assignment16wrapperclasses;

//8.	Show use of valueof(String , int) method of wrapper class.

//The valueOf(String s, int radix) method is used to return an Integer object
//holding the value extracted from the specified string when parsed with the radix 
//given by the second argument. In other words, this method returns an Integer object equal to the value of:

public class Q8valueofStringintMethod {

	public static void main(String[] args) {
		
		String s = "999";
		int radix = 15;
		
		Integer i1 = Integer.valueOf(s, radix);
		System.out.println(i1);

	}

}
