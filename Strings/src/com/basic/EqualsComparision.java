package com.basic;

public class EqualsComparision {

	public static void main(String[] args) {
		
		// using literal
		String s1 = "Hello";
		String s2 = "Hello";
		
		//using new
		String s3 = new String("Hello");
		String s4 = new String("Hello");	
		
		System.out.println(s1==s2);//Comparing reference : id is same
		
		System.out.println(s1.equals(s2)); //comparing values 
		
		System.out.println("-------------------------------------");
		
		System.out.println(s1==s3); //id not same
		System.out.println(s1.equals(s3));// value is same
		
		System.out.println("--------------------------------------");
		
		System.out.println(s4 == s3);//id not same
		System.out.println(s4.equals(s3	));//value is same
		

	}

}
