package com.lab9;

// show program of counter using static keyword
// Show use of static block
public class StaticDemo {

	private int x = 10;
	static int y = 10;
	
	static String colour = "red";

	
	static {
		colour = "green";
	}
	
	StaticDemo() {
		x++;
		y++;
		System.out.println(x); // 11 11
		System.out.println(y); // 11 12
	}

	public static void main(String[] args) {

		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		
		System.out.println(colour);
	}
}

// why is the java main method static ?


// write a difference between static method and instance method ?
// 

// Write a difference between static variable and instance variabe ?
// 

// Can we execute a program without main() method ?


