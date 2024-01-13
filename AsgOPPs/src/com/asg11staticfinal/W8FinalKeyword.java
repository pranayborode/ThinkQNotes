package com.asg11staticfinal;

//8.	WAP to show use of ‘final’ keyword (with variable, with method and with class).

class Person3 {
	private final String name ;
	private int age;
	public static final String NATIONALITY = "Indian";
	
	
	public Person3(String name, int age) {
	     this.name = name;
	     this.age = age;
	 }
	
	public final void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Nationality: " + NATIONALITY); // Accessing final static variable
    }
}

final class Student3 extends Person3{
	 
	private String studentId;
	
	public Student3(String name, int age, String studentId) {
        super(name, age);                                     // Calling the parent class constructor
        this.studentId = studentId;
    }
//	public void displayInfo() {    //Cannot override the final method from Person3
//        super.displayInfo(); // Calling the displayInfo method of the parent class
//        System.out.println("Student ID: " + this.studentId);
//    }
	
}

//class SubStudent extends Student3{ }  //The type SubStudent cannot subclass the final class Student3


public class W8FinalKeyword {

	public static void main(String[] args) {
		
		Student3 s1 = new Student3("Rahul", 20, "S12345");
		s1.displayInfo();
		
		

	}

}
