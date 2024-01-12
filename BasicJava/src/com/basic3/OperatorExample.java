package com.basic3;

public class OperatorExample {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
//		int x = a++ + ++a + ++a + a++;
//	
//		System.out.println(x);
//		System.out.println(a);
		
		
		int y = a++ + ++b + --a + b-- + a++ + --b;
		System.out.println(y); // 91 
		System.out.println(a); // 11
		System.out.println(b); // 19
		

	}

}
