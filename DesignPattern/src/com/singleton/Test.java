package com.singleton;

public class Test {

	public static void main(String[] args) {
		
		SingletonDemo s1 = SingletonDemo.getInstance();
		SingletonDemo s2 = SingletonDemo.getInstance();
		SingletonDemo s3 = SingletonDemo.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println("--------------------------------------");
		
		System.out.println(s1.msg);
		System.out.println(s2.msg);
		System.out.println(s3.msg);
		
		s1.msg = "Hello";
		
		System.out.println(s1.msg);
		System.out.println(s2.msg);
		System.out.println(s3.msg);
	}
	

}
