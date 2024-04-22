package com.lab16CW;

import java.io.IOException;
import java.nio.CharBuffer;

//Write a Java program to create an interface Resizable with methods 
//resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. 
//Create a class Rectangle that implements the Resizable interface and implements the resize methods.

interface Resizable {
	void resizeWidth(int width);
	void resizeHeight(int height);
}

class Rectangle  implements Resizable{

	
	public void resizeWidth(int width) {
		System.out.println("Width : "+width);
	}
	
	public void resizeHeight(int height) {
		System.out.println("Width : "+height);
	}
	
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.resizeWidth(12);
		r.resizeHeight(7);

	}



}
