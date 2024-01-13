package com.assignment16wrapperclasses;


//7.	Show use of valueof(String) method of wrapper class.
public class Q7valueofStringMethod {

	public static void main(String[] args) {
		
		String byteString = "12";
		Byte b1 = Byte.valueOf(byteString);
		System.out.println("Byte : "+b1);
		
		Short s1 = Short.valueOf("1234");
		System.out.println("Short : "+s1);
		
		Integer i1 = Integer.valueOf("1122233");
		System.out.println("Integer : "+i1);
		
		Long l1 = Long.valueOf("9812323333");
		System.out.println("Long : "+l1);
		
		Float f1 = Float.valueOf("12.12");
		System.out.println("Float : "+f1);
	
		Double d1 = Double.valueOf("1234.2182");
		System.out.println("Double : "+d1);
		
		String ch = "A";
		Character c1 = Character.valueOf(ch.charAt(0));  //////
		System.out.println("Character : "+c1);
		
		
		String booleanString = "true";
		Boolean bln = Boolean.valueOf(booleanString);
		System.out.println("Boolean : "+bln);
		

	}

}
