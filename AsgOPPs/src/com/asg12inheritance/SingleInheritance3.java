package com.asg12inheritance;


class Shape{
	
	void draw() {
		System.out.println("Drawing a shape");
	}
}

class Circle extends Shape{
	
	void draw() {
		System.out.println("Drawing a circle");
	}
}

public class SingleInheritance3 {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.draw();

	}

}
