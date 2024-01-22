package com.basic;

public class Methods {

	public static void main(String[] args) {

		String s = "Java is fun";
		System.out.println("Length is:" + s.length());

		// charAt

		System.out.println("character at 1:" + s.charAt(0));
		System.out.println("character at last:" + s.charAt(s.length() - 1));

		// choncat : concat, +

		String s1 = "Hello";
		String s2 = "World";

		System.out.println(s1.concat(s2));
		System.out.println(s1 + s2);

		// substring

		System.out.println(s.substring(1));
		System.out.println(s.substring(1, 7));// Print from 1st index till(7-1) index

		// contains
		System.out.println(s.contains("ava"));
		System.out.println(s.contains("pyth"));

		String s3 = "hello";

		System.out.println("---------------------------");
		System.out.println(s1 == s3);
		System.out.println(s1.equalsIgnoreCase(s3));

		// Upper case and lower case
		System.out.println(s1.toUpperCase());
		System.out.println(s1);

		String s4 = "HELLO";
		System.out.println(s4.toLowerCase());
		System.out.println(s4);

		System.out.println("----------------------------");

		s4 = s4.toLowerCase();
		System.out.println(s4);

		System.out.println("----------------------------");

		// index of

		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));

		System.out.println(s.indexOf("is"));

		// isEmpty

		String str1 = "    ";

		System.out.println(str1.isBlank()); // return true
		System.out.println(str1.isEmpty()); // return false: length = 0;

		System.out.println("=========================================");

		// trim

		String str2 = "   java    ";
		System.out.println(str2.length());
		str2 = str2.trim(); // remove leading and trailing white spaces.
		System.out.println(str2);
		System.out.println(str2.length());

	}

}
