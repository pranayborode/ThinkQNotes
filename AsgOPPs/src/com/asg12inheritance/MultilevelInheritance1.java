package com.asg12inheritance;



//Parent Class
class Animal2{
	
	void eat() {
		System.out.println("Animal is eating");
	}
}

//Child Class
class Dog2 extends Animal2 {
	
	void bark() {
		System.out.println("Dog is barking");
	}
}

class Bulldog extends Dog2 {
    void strong() {
        System.out.println("Bulldog is strong");
    }
}

public class MultilevelInheritance1 {

	public static void main(String[] args) {
		
		Bulldog bdog = new Bulldog();
		
		bdog.eat();
		bdog.bark();
		bdog.strong();

	}

}
