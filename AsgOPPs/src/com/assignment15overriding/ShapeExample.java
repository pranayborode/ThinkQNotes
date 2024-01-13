package com.assignment15overriding;


//4)WAP to create class shape with method draw().
//create class circle, square, Rectangle which extends 
//Shape implement draw() differently in each child.


class Shape{
	public void draw() {
		System.out.println("Drawing a Shape");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

class Square extends Shape{
	public void draw() {
		System.out.println("Drawing a Square");
	}
}

class Rectangle extends Shape{
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}
public class ShapeExample {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.draw();
		
		Square s = new Square();
		s.draw();
		
		Rectangle r = new Rectangle();
		r.draw();

	}

}
