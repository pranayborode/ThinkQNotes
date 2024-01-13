package com.asg9constructor;

public class Comparator {

	public void compare(int num1, int num2) {

		if (num1 > num2) {
			System.out.println("Greater Integer : " + num1);
		} else if (num2 > num1) {

			System.out.println("Greater Integer : " + num2);
		} else {

			System.out.println("Both Integer are Equal");
		}
	}

	public void compare(char ch1, char ch2) {

		int numericValue1 =(char)ch1; 
		int numericValue2 =(char)ch2;
		
		if (numericValue1 > numericValue2) {
			System.out.println("Character with higher numeric value : " + numericValue1);
		} else if (numericValue2 > numericValue1) {

			System.out.println("Character with higher numeric value : " + numericValue2);
		} else {

			System.out.println("Characters have equal numeric values");
		}
	}

	public static void main(String[] args) {

		Comparator c = new Comparator();

		c.compare(10, 8);
		c.compare('A', 'Q');
	}

}
