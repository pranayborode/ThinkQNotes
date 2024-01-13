package com.asg12inheritance;



class Shape3{
	
	void draw() {
		System.out.println("Drawing a shape");
	}
}

class Circle3 extends Shape3{
	
	void draw() {
		System.out.println("Drawing a circle");
	}
}

class Square extends Shape3{
	void draw() {
		System.out.println("Drawing a Square");
	}
}

public class HierarchicalInheritance3 {

	public static void main(String[] args) {
		
		Circle3 c1 = new Circle3();
		c1.draw();
		
		Square s1 = new Square();
		s1.draw();
		

	}

}
