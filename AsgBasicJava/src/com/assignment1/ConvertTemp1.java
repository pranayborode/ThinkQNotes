package com.assignment1;

// 7. Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit.

public class ConvertTemp1 {

	public static void main(String[] args) {

		double fahrenheit, celsius;

		celsius = 72;

		fahrenheit = (celsius * (9 / 5)) + 32;

		System.out.println("Temp in Fahrenheit is " + fahrenheit);

	}
}
