package com.basic1;

public class OperatorExample2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		System.out.println(a++ + ++a); // 10 + 12 = 22
		System.out.println(b++ + b++); // 10 + 11 = 21
		
		System.out.println(a-- - --a); // 10 - 8 = 2
		System.out.println(b-- - b--); // 10 - 9 = 1
		
		System.out.println(10*10/5+3-1*4/2);
		// 10*2+3-1*2
		// 20 + 3 - 2
		// 21

	}

}
