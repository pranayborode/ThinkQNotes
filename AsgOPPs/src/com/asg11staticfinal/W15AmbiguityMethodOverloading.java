package com.asg11staticfinal;


//15.	WAP to show ambiguity in method overloading

public class W15AmbiguityMethodOverloading {

	public void add(int a, double b) {
		System.out.println("Sum of two numbers : "+(a+b));
	}
	
	public void add(double a, int b) {
		System.out.println("Sum of two numbers : "+(a+b));
	}
	
	public static void main(String[] args) {
		
		W15AmbiguityMethodOverloading amo = new W15AmbiguityMethodOverloading();
		
		//amo.add(10, 20);
		//amo.add(12, 222); //The method add(int, double) is ambiguous for the type W15AmbiguityMethodOverloading

		amo.add(17.4, 16);
	}

}
