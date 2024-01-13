package com.assignment16wrapperclasses;

//1.	Show one example of boxing and unboxing for all 8 primitive data types.

public class Q1BoxingUnboxingExample {

	
	public static void main(String[] args) {
	
		byte b1 = 10;
		Byte b2 = Byte.valueOf(b1); //boxing
		byte b3 = b2.byteValue();   //unboxing
		
		System.out.println(b2);
		System.out.println(b3);
		
		
		short s1 = 120;
		Short s2 = Short.valueOf(b1); //boxing
		short s3 = b2.shortValue();   //unboxing
		
		System.out.println(s2);
		System.out.println(s3);
		
		int i1 = 1234;
		Integer i2 = Integer.valueOf(i1);
		int i3 = i2.intValue();
		
		System.out.println(i2);
		System.out.println(i3);
		
		
		long l1 = 123L;
		Long l2 = Long.valueOf(l1);
		long l3 = l2.longValue();
		
		System.out.println(l2);
		System.out.println(l3);
		
		float f1 = 999.55f;
		Float f2 = Float.valueOf(f1);
		float f3 = f2.floatValue();
		
		System.out.println(f2);
		System.out.println(f3);
		
		
		double d1 = 99.99;
		Double d2 = Double.valueOf(d1);
		double d3 = d2.doubleValue();
		
		System.out.println(d2);
		System.out.println(d3);
		
		
		char c1 = 'a';
		Character c2 = Character.valueOf(c1);
		char c3 = c2.charValue();
		
		System.out.println(c2);
		System.out.println(c3);
		
		boolean bul1 = true;
		Boolean bul2 = Boolean.valueOf(bul1);
		boolean bul3 = bul2.booleanValue();
		
		System.out.println(bul2);
		System.out.println(bul3);

	}

}
