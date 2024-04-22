package com.lab15;

abstract class Shape {

	abstract void calculatearea();

	public void calcuCir(int r) {
		System.out.println("Circumference of Circle : " + (2 * 3.14 * r));
	}
}

class Circle extends Shape {

	int r = 5;

	@Override
	void calculatearea() {

		System.out.println("Area of Circle : " + (3.14 * r * r));

	}

}

class Rectangle extends Shape {

	int length = 8;
	int breadth = 6;

	@Override
	void calculatearea() {

		System.out.println("Area of Rectangle : " + length * breadth);

	}
}

class Square extends Shape {

	int side = 4;

	@Override
	void calculatearea() {
		System.out.println("Area of Square : " + side * side);

	}

}