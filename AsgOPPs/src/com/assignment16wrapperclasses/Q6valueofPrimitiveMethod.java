package com.assignment16wrapperclasses;


//6.	Show use of valueof(primitive type) method of each wrapper class.
public class Q6valueofPrimitiveMethod {

	public static void main(String[] args) {
		
		Byte b1 = Byte.valueOf((byte) 12);
		System.out.println("Byte : "+b1);
		
		Short s1 = Short.valueOf((short) 120);
		System.out.println("Short : "+s1);
		
		Integer i1 = Integer.valueOf(15);
		System.out.println("Integer : "+i1);
		
		Long l1 = Long.valueOf(12345L);
		System.out.println("Long : "+l1);
		
		Float f1 = Float.valueOf(12.12f);
		System.out.println("Float : "+f1);
		
		Double d1 = Double.valueOf(1234.212);
		System.out.println("Double : "+d1);
		
		Character c1 = Character.valueOf((char)'A');
		System.out.println("Character : "+c1);
		
		Boolean bln = Boolean.valueOf(false);
		System.out.println("Boolean : "+bln);
		
		

	}

}
