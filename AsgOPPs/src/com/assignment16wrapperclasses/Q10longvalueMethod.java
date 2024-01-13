package com.assignment16wrapperclasses;

//10.	Show use of longvalue method of all wrapper classes.

public class Q10longvalueMethod {

	public static void main(String[] args) {
		
		Byte b1 = 11;
		long long1 = b1.longValue();
		System.out.println("Byte - long : "+long1);
		
		Short s1 = 120;
		long long2 = s1.longValue();
		System.out.println("Short - long : "+long2);
		
		Integer i1 = 12345;
		long long3 = i1.longValue();
		System.out.println("Integer - long : "+long3);
		
		Long l1 = 1234567890L;
		long long4 = l1.longValue();
		System.out.println("Long - long : "+long4);
		
		Float f1 = 12.12f;
		long long5 = f1.longValue();
		System.out.println("Float - long : "+long5);
		
		Double d1 = 1234.1234;
		long long6 = d1.longValue();
		System.out.println("Double - long : "+long6);

	}

}
