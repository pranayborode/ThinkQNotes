package com.lambda2;

interface LengthName{
	
	int findLength(String name);
	
	default void printName(String name) {
		System.out.println("Welcome "+name);
	}
}

public class LanbdaWithReturn {

	public static void main(String[] args) {
		
		String n = "Pranay";

		LengthName l1 = name ->{return name.length();};
		
		System.out.println("Length of name "+n+" is "+l1.findLength(n));
		
		//return: remove
		//omit {} and omit return
		
		LengthName l2 = name -> name.length();
		System.out.println("Length of name "+n+" is "+l2.findLength(n));
	}

}
