package com.asg8oppsmethods;


//2 )  Create getId() method in Student class. call getId() method
//from displayData method so that you know that one
//method can be called from another method. Return id
//from getId() method and set that id to the instance
//variable in displayData method.

//3. create another method in Student class setCustomData(int
//customId, String customName) These 2 variables are local
//variables. Call setCustomData from main method using
//Student object and assign any values to customId,
//customName from main method. Observe your values are
//overwritten in id and name instance variables. Then print
//id and name in main method.

public class Student2 {

	private int id;
	private String name;
	
	public Student2(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
        return id;
    }
	
	public void displayDate() {
		
		System.out.println("Original value : ");
		System.out.println("Id   : "+getId());
		System.out.println("Name : "+name);
		
		System.out.println("----------------------");
		
		id = 101;
		name = "Pranay";
		
		System.out.println("Changed value : ");
		System.out.println("Id   : "+getId());
		System.out.println("Name : "+name);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Student2 s = new Student2(100, "Amar");
		
		s.displayDate();

		
	}

}
