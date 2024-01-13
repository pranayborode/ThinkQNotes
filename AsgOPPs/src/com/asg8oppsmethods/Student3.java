package com.asg8oppsmethods;

//3. create another method in Student class setCustomData(int
//customId, String customName) These 2 variables are local
//variables. Call setCustomData from main method using
//Student object and assign any values to customId,
//customName from main method. Observe your values are
//overwritten in id and name instance variables. Then print
//id and name in main method.

public class Student3 {

	private int id;
	private String name;

	public Student3(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void displayDate() {

		System.out.println("Original value : ");
		System.out.println("Id   : " + getId());
		System.out.println("Name : " + name);

		System.out.println("----------------------");

		id = 101;
		name = "Pranay";

		System.out.println("Changed value : ");
		System.out.println("Id   : " + getId());
		System.out.println("Name : " + name);

	}

	public void setCustomDate(int customId, String customName) {
		id = customId;
		name = customName;
	}

	public static void main(String[] args) {

		Student3 s = new Student3(100, "Amar");

		s.displayDate();

		int customId = 1001;
		String customName = "Anup";

		s.setCustomDate(customId, customName);

		System.out.println("Print values in main method");

		System.out.println("Id   : " + s.id);
		System.out.println("Name : " + s.name);

	}

}
