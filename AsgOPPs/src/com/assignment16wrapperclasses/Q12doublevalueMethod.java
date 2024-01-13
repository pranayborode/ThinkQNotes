package com.assignment16wrapperclasses;

//12.	Show use of doublevalue method of all wrapper classes

public class Q12doublevalueMethod {

	public static void main(String[] args) {
		
		Byte b1 = 11;
		double double1 = b1.doubleValue();
		System.out.println("Byte - double : "+double1);
		
		Short s1 = 120;
		double double2 = s1.doubleValue();
		System.out.println("Short - double : "+double2);
		
		Integer i1 = 12345;
		double double3 = i1.doubleValue();
		System.out.println("Integer - double : "+double3);
		
		Long l1 = 1234567890L;
		double double4 = l1.doubleValue();
		System.out.println("Long - double : "+double4);
		
		Float f1 = 12.12f;
		double double5 = f1.doubleValue();
		System.out.println("Float - double : "+double5);
		
		Double d1 = 1234.1234;
		double double6 = d1.floatValue();
		System.out.println("Double - float : "+double6);

	}

}
