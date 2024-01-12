package com.ifelse;

public class ShortHand {

	public static void main(String[] args) {

		byte a = 4;
		byte b = 19;

		a += a;
		System.out.println(a);

		b -= b;
		System.out.println(b);

		float f1 = 13.6f;
		float f2 = 15.99f;

		System.out.println(f1 *= f1);
		System.out.println(f2 /= f2);

	}

}
