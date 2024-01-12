package com.basic2;

public class OperatorExample1 {

	public static void main(String[] args) {

		int a = 10;

		System.out.println(a++); // 10
		System.out.println(a); // 11

		System.out.println(++a); // 12
		System.out.println(a); // 12

		System.out.println(a--); // 12
		System.out.println(a); // 11

		System.out.println(--a); // 10
		System.out.println(a); // 10

		int x = 10;
		int y = 10;

		System.out.println(x++ + ++x); // 10 + 12 = 22
		System.out.println(++y + y++); // 11 + 11 = 22

		int b = 10;
		int c = 10;

		System.out.println(b-- - --b); // 10 - 8 = 2
		System.out.println(--c - c--); // 9 - 9 = 0

		int j = 20;
		int k = j++ + --j - ++j - --j; // 20 + 20 -21 -20
		System.out.println(k); // -1

	}

}
