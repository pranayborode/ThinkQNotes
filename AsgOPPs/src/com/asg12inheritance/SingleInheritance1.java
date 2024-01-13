package com.asg12inheritance;

//1.	Write 3 programs for single inheritance. 

// Parent Class
class Animal{
	
	void eat() {
		System.out.println("Animal is eating");
	}
}

// Child Class
class Dog extends Animal {
	
	void bark() {
		System.out.println("Dog is barking");
	}
}

public class SingleInheritance1 {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
		d1.eat();
		d1.bark();

	}

}
