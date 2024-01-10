package com.assignment1;

// 12. Write a Java program to enter two angles of a triangle and find the third angle

public class AnglesOfTriangle {

	public static void main(String[] args) {

		double angle1 = 50;
		double angle2 = 70;

		double angle3 = (180 - (angle1 + angle2));

		System.out.println(angle3);

	}

}
