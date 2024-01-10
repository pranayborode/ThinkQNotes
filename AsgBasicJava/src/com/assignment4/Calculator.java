package com.assignment4;

import java.util.Scanner;


//.WAP in java using switch case for following: Area of a circle Area of a square 
//Area of a right angled triangle Area of a rectangle Circumference of a circle 
//Perimeter of a square Accept inputs like radius,side,etc through keyboard.
//Menu driven program using switch case:

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Area of a circle");
		System.out.println("2. Area of a square");
		System.out.println("3. Area of a right angled triangle ");
		System.out.println("4. Area of a rectangle");
		System.out.println("5. Circumference of a circle");
		System.out.println("6. Perimeter of a square");

		System.out.print("Enter your choice (1-6): ");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.print("Enter the radius of circle: ");
			double radius = sc.nextDouble();

			double areaCircle = Math.PI * radius * radius; // AC = PI * radius^2

			System.out.println("Area of the circle: " + areaCircle);
			break;
		case 2:
			System.out.print("Enter the side of square: ");
			double side = sc.nextDouble();

			double areaSquare = side * side; // aSq= side^2

			System.out.println("Area of the square: " + areaSquare);
			break;
		case 3:
			System.out.print("Enter the base of right angled triangle: ");
			double base = sc.nextDouble();

			System.out.print("Enter the height of the right angled triangle: ");
			double height = sc.nextDouble();

			double areaTriangle = 0.5 * base * height; // aTri = 1/2 * base * height

			System.out.println("Area of the right angled triangle: " + areaTriangle);
			break;
		case 4:
			System.out.println("Enter the length of rectangle: ");
			double length = sc.nextDouble();

			System.out.println("Enter the width of rectangle: ");
			double width = sc.nextDouble();

			double areaRectangle = length * width; // aRec = length * width

			System.out.println("Area of the Rectangel: " + areaRectangle);
			break;
		case 5:
			System.out.print("Enter the radius of circle: ");
			double radiusCircle = sc.nextDouble();

			double circumference = 2 * Math.PI * radiusCircle; // circumference = 2 * Pi * r

			System.out.println("Circumference of a circle: " + circumference);
			break;
		case 6:
			System.out.print("Enter the side of square: ");
			double sideSquare = sc.nextDouble();

			double perimeterSquare = 4 * sideSquare; // perimeter of Square = 4 * side;

			System.out.println("Perimeter of a square: " + perimeterSquare);
			break;

		default:
			System.out.println("Please enter valid choice between 1-6");

		}
		sc.close();

	}
}
