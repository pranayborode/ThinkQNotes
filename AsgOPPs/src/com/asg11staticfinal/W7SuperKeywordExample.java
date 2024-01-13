package com.asg11staticfinal;

//7.	WAP to show all the use of ‘super’ keyword.
//9.	WAP to use this and super in an instance method.
//10.	WAP to use this and super in static method.
//11.	WAP to show ways to access static variable
class Person1 {
	private String name;
	private int age;
	int x = 10;

	public static String nationality = "Indian";

	public Person1() {

	}

	public Person1(String name, int age) {

		this.name = name; //// Use 'this' to refer to instance variables and distinguish from parameters
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("Name        : " + this.name); // Use 'this' to refer to instance variables within the class
		System.out.println("Age         : " + this.age);
		System.out.println("Nationality : " + this.nationality);
	}

	public void showParentVariable() {
		int x = 20;
		System.out.println("local variable : " + x);
		System.out.println("Instance variable : " + this.x);
	}

}

class Student1 extends Person1 {

	int x = 30;
	private String schoolName;
	public static String div = "8th";

	public Student1() {
		super();
	}

	public Student1(String name, int age, String schoolName) {
		super(name, age); // super() - Calling the parent class constructor
		this.schoolName = schoolName;

	}

	public void displayInfo() {
		super.displayInfo(); // Calling the displayInfo method of the parent class
		System.out.println("Student Name: " + this.schoolName);

		System.out.println("Division : " + this.div);
	}

//	public static void displayStaticMethod() {
//		 super.displayInfo();  //Cannot use super in a static context
//		System.out.println("Student Name: " + this.schoolName); //Cannot use this in a static context
//	}

	public void showStudentVariable() {
		int x = 20;
		System.out.println("local variable : " + x);
		System.out.println("Instance variable : " + this.x);
		System.out.println("Parent class Instance Variable : " + super.x);
	}

}

public class W7SuperKeywordExample {

	public static void main(String[] args) {
		Person1 p1 = new Person1();
		Student1 s1 = new Student1();

		p1.showParentVariable();
		System.out.println("-----------------------------\n");
		s1.showStudentVariable();
		System.out.println("-----------------------------\n");

		Student1 s2 = new Student1("Sahil", 28, "VBMV");

		s2.displayInfo();
		System.out.println("-----------------------------\n");

		System.out.println("Default Division : " + Student1.div);
		Student1.div = "9th";
		System.out.println("Updated Division : " + Student1.div); // we can access static variable by calling class name
		System.out.println("-----------------------------\n");
		
		s2.displayInfo();

	}

}
