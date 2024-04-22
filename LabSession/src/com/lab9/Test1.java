package com.lab9;

public class Test1 {

	
	public static void main(String[] args) {
		
		int x = 20; 
		System.out.println(x);

	}
	static {
		int x = 10;
		System.out.print(x+" ");   
	}
}
// first it execute static block then main method 
// ans - 10 20