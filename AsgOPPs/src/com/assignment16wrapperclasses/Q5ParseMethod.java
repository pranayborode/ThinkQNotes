package com.assignment16wrapperclasses;


//5.Convert “100” to primitive byte , int, short , float double 
//using parse method of corresponding wrapper classes.

public class Q5ParseMethod {

	public static void main(String[] args) {
		
		String numberString = "100";
		
		byte b1 = Byte.parseByte(numberString);
		System.out.println("byte value : "+b1);
		
		int i1 = Integer.parseInt(numberString);
		System.out.println("int value : "+i1);
		
		short s1 = Short.parseShort(numberString);
		System.out.println("short value : "+s1);
		
		float f1 = Float.parseFloat(numberString);
		System.out.println("short value : "+f1);
		
		double d1 = Double.parseDouble(numberString);
		System.out.println("double value : "+d1);
		

	}

}
