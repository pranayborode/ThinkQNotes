package com.assignment16wrapperclasses;

// 9.Show use of intvalue method for all wrapper classes.

public class Q9intvalueMethod {

	public static void main(String[] args) {
		
		Byte b1 = 10;
		int int1 = b1.intValue();
		System.out.println("Byte - int : "+int1);
		
		Short s1 = 120;
		int int2 = s1.intValue();
		System.out.println("Short - int : "+int2);
		
		Integer i1 = 98;
		int int3 = i1.intValue();
		System.out.println("Integer - int : "+int3);
		
		Long l1 = 12345L;
		int int4 = l1.intValue();
		System.out.println("Long - int : "+int4);
		
		Float f1 = 99.99f;
		int int5 = f1.intValue();
		System.out.println("Float - int : "+int5);
		
		Double d1 = 1234.1234;
		int int6 = d1.intValue();
		System.out.println("Double - int : "+int6);
		
		
		

	}

}
