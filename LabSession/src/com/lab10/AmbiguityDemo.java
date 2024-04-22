package com.lab10;

public class AmbiguityDemo {

	public static void add(int a , float b) {
		System.out.println("Add : "+(a+b));
	}
	
	public static void add(float a , int b) {
		System.out.println("Add : "+(a+b));
	}
	
	public static void main(String[] args) {
		
		//add(10, 10); //The method add(int, float) is ambiguous for the type AmbiguityDemo
		
		// To overcome ambiguity problem we need declare parameter specific
		
		add(10f, 10);
		add(10, 10f);

	}

}
