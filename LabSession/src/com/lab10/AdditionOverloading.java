package com.lab10;

public class AdditionOverloading {

	public void add(int a, int b) {

		System.out.println("a + b = " + (a + b));
	}

	public void add(float a, int b) {

		System.out.println("a + b = " + (a + b));
	}

	public void add(int a, float b, double c) {

		System.out.println("a + b + c = " + (a + b +c));
	}

	public double add(long a, float b, double c) {

		return (a + b + c);
	}

	public double add(int a, int b, double c) {

		return (a + b + c);
	}

	public static void main(String[] args) {

		AdditionOverloading a1 = new AdditionOverloading();
		
		a1.add(4, 5);    // int a, int b
		a1.add(9.7f, 8); // float a, int b
		a1.add(7, 7.0f, 8); //int a, float b, double c
		System.out.println("a + b + c = "+a1.add(89L, 5.4f, 23));     //long a, float b, double 
        System.out.println("a + b + c = "+a1.add(89, 7, 65));  //int a, int b, double c
		
	}

}
