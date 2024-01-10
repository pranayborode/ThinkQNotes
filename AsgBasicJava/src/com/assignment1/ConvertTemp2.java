package com.assignment1;

//8. Write a Java program to enter temperature in Fahrenheit(°F) and convert it into Celsius(°C)

public class ConvertTemp2 {

	public static void main(String[] args) {

		double fahrenheit, celsius;

		fahrenheit = 104;

		celsius = (fahrenheit - 32) * (5 / 9);

		System.out.println("Temp in Celsius is " + celsius);

	}

}
