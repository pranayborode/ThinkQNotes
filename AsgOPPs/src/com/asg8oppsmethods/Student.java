package com.asg8oppsmethods;


//1) add method displayData inside Student class change values of id name in that method & also print the changed
//values in same method. Call displayData method from main method and see the output. Observe displayData can
//only be called by creating object of Student

public class Student {

	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public void displayDate() {
		
		System.out.println("Original value : ");
		System.out.println("Id   : "+id);
		System.out.println("Name : "+name);
		
		System.out.println("----------------------");
		
		id = 101;
		name = "Pranay";
		
		System.out.println("Changed value : ");
		System.out.println("Id   : "+id);
		System.out.println("Name : "+name);
		
	}
	
	public static void main(String[] args) {
		
		Student s = new Student(100, "Amar");
		
		s.displayDate();

		
	}

}
