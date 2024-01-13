package com.assignment16wrapperclasses;

//11.	Show use of floatvalue method of all wrapper classes.

public class Q11floatvalueMethod {

	public static void main(String[] args) {
		
		Byte b1 = 11;
		float float1 = b1.floatValue();
		System.out.println("Byte - float : "+float1);
		
		Short s1 = 120;
		float float2 = s1.floatValue();
		System.out.println("Short - float : "+float2);
		
		Integer i1 = 12345;
		float float3 = i1.floatValue();
		System.out.println("Integer - float : "+float3);
		
		Long l1 = 1234567890L;
		float float4 = l1.floatValue();
		System.out.println("Long - float : "+float4);
		
		Float f1 = 12.12f;
		float float5 = f1.floatValue();
		System.out.println("Float - float : "+float5);
		
		Double d1 = 1234.1234;
		float float6 = d1.floatValue();
		System.out.println("Double - float : "+float6);

	}

}
