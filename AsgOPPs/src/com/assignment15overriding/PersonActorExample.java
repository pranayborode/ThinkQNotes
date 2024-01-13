package com.assignment15overriding;

//8)WAP to create class Person with method readScript().
//create class Actor which extends Person implement readScript() differently in child.

class Person{
	
	public void readScript() {
		System.out.println("Person is reading a Script");
	}
}

class Actor extends Person{
	
	public void readScript() {
		System.out.println("Actor is reading a Script");
	}
	
}
public class PersonActorExample {

	public static void main(String[] args) {
		
		Actor a = new Actor();
		a.readScript();

	}

}
