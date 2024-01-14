package com.string2;

//22. Count the numbers in a string
public class Q22CountNumbersInString {

	public static void cuntNum(String str) {

		int sum = 0;

		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (str.charAt(i) > '0' && str.charAt(i) < '9') {

				sum += Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println("Sum of Num : " + sum);

	}

	public static void main(String[] args) {

		String str = "java123";
		cuntNum(str);

	}

}
