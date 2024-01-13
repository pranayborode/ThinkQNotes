package com.asg11staticfinal;

//6.	WAP to show all the use of ‘this’ keyword.

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {

		this.name = name; //// Use 'this' to refer to instance variables and distinguish from parameters
		this.age = age;
	}

	public void updateInfo(String name, int age) {

		this.name = name; // Use 'this' to access instance variables and distinguish from parameters
		this.age = age;
	}

	public void displayInfo() {

		System.out.println("Name: " + this.name); // Use 'this' to refer to instance variables within the class
		System.out.println("Age: " + this.age);
	}

}

public class W6ThisKeywordExample {

	public static void main(String[] args) {
		Person person = new Person("Sanket", 25);

		person.displayInfo();

		person.updateInfo("Sanket", 29);

		person.displayInfo();

	}

}
