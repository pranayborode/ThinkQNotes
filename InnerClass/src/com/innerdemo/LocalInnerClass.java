package com.innerdemo;

class Outer{
	
	private static int data = 10;
	
	void display() {
		
		class Inner{
			private int value = 90;
			
			static 	void show() {
			//	System.out.println(value);
				System.out.println(data);
			}
			
			void show1() {
				System.out.println(value);
			}
		}
		
		Inner i1 = new Inner();
		i1.show1();
		Inner.show();  //call static method 
	}
	
}


public class LocalInnerClass {

	public static void main(String[] args) {
		
		Outer o1 = new Outer();
		o1.display();

	}

}
