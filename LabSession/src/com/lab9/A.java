package com.lab9;

public class A {

	int a = 40; // non static 
	
	public static void main(String[] args) {
		
		//System.out.println(a); 
		//Cannot make a static reference to the non-static field a
		
		// to access non static variable we need to call it by class object
		
		A a1 = new A();
		System.out.println(a1.a); //40

	}

}
