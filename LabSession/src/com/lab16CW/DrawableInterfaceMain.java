package com.lab16CW;

//
//Write a Java program to create an interface Drawable with a method draw()
//that takes no arguments and returns void. Create three classes 
//Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() 
//method to draw their respective shapes.


interface Drawable {
	
	void draw();
}

class Circle implements Drawable{

	@Override
	public void draw() {
		System.out.println("Draw a Circle");
		
	}
	
}

class Rectangle2 implements Drawable{

	@Override
	public void draw() {
		System.out.println("Draw a Rectangle");
		
	}
	
}

class Triangle implements Drawable{

	@Override
	public void draw() {
		System.out.println("Draw a Triangle");
		
	}
	
}

public class DrawableInterfaceMain {

	public static void main(String[] args) {
		
	Drawable d ;
	d = new Circle();
    d.draw();
    
    d= new Rectangle2();
    d.draw();
    
    d= new Triangle();
    d.draw();

	}

}
