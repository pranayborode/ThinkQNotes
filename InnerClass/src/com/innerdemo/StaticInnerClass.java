package com.innerdemo;

class Parent{
	
	static int num1 = 100;
	int num2 = 200;
	
	void display() {
		System.out.println("Num1 : "+num1);
		System.out.println("Num2 : "+num2);
	}
	
	static class Inner{
		
		String msg1 = "Hello";
		static String msg2 = "Welcome";
		
		
		void show() {
			System.out.println("Num1 : "+num1);
			//System.out.println("Num2 : "+num2);
			
			System.out.println("Message : "+msg1);
			System.out.println("Message : "+msg2);
			
			Parent p1 = new Parent();
			p1.display();
		}
	}
}


public class StaticInnerClass {

	public static void main(String[] args) {
		Parent.Inner p1 = new Parent.Inner();
		p1.show();
		

		Parent p2 = new Parent();
		p2.display();
		
		

	}

}
