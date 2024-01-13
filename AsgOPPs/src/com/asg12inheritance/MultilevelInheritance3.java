package com.asg12inheritance;


class Shape2{
	
	void draw() {
		System.out.println("Drawing a shape");
	}
}

class Circle2 extends Shape2{
	
	void draw() {
		System.out.println("Drawing a circle");
	}
}
class CircleColore extends Circle2 {
    String color;

   
    CircleColore(String color) {
        this.color = color;
    }

    void displayColor() {
        System.out.println("Color of Circle is " + color);
    }
}
public class MultilevelInheritance3 {

	public static void main(String[] args) {
		
		CircleColore c1 = new CircleColore("Red");
		c1.draw();
		c1.displayColor();

	}

}
