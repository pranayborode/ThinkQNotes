package com.asg10thissuper;

// Parent class
class Animal{
	
	String colour = "white";
	
	void eat() {
		System.out.println("Animal is eating");
	}
	
	Animal(){
		System.out.println("Parent class Constructor");
	}
	
}


// Child class
class Dog extends Animal{
	
	String colour = "black";
	
	void displayColour() {
		System.out.println("Child Class colour : "+colour);
		System.out.println("Parent Class colour : "+super.colour); //super used to access parent class instance variable
	}
	
	
	void eat() {
		super.eat(); //super is used to invoke parent class method 
		System.out.println("Dog is eating");
	}
	
	Dog(){
		super();  // parent class constructor is invoke by using super()
		System.out.println("Dog class constructor is called");
	}
}


public class SuperDemo {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
		d1.displayColour();
		
		d1.eat();

	}

}
