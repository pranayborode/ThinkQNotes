package com.assignment1;

// 5. Write a Java program to enter radius of a circle and find its diameter, circumference and area.

public class Circle {

	public static void main(String[] args) {

		double radius, pi, diameter, circumference, area;

		radius = 6;
		pi = 3.14;

		diameter = 2 * radius;
		circumference = 2 * pi * radius;
		area = pi * (radius * radius);

		System.out.println("Diameter of Circle is " + diameter);
		System.out.println("Circumference of Circle is " + circumference);
		System.out.println("Area of Circle is " + area);

	}

}
