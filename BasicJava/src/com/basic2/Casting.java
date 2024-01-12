package com.basic2;

public class Casting {

	public static void main(String[] args) {

		char ch = 'h';
		int num = ch;
		System.out.println(num); // 104

		int num1 = 117;
		char ch1 = (char) num1;
		System.out.println(ch1); // u

		byte a = 10;
		byte b = 20;
		byte sum = (byte) (a + b);
		System.out.println(sum); // 30

		float f1 = 989.5689f;
		int i1 = (int) f1;
		System.out.println(i1); // 989

		int i2 = 2423;
		float f2 = i2;
		System.out.println(f2); // 2423.0

		double d1 = 120000.9878;
		int i3 = (int) d1;
		System.out.println(i3); //120000
		
		float f3 = 8383.98f;
		double d2 = f3;
		System.out.println(d2); // 8383.98
		
		long l1 = 9000;
		int i4 = (int)l1;
		System.out.println(i4); // 9000
		
		float f4 = 6900.77f;
		long l2 = (long)f4;
		System.out.println(l2); // 6900
		
		long l3 = 12790;
		short s1 = (short) l3;
		System.out.println(s1); // 12790
		
		

	}

}
