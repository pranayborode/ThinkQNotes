package com.assignment22arrayofobject;

//5. Create array of students, student has (roll, name, age, marks). Print only
//   those students who have marks more than 60 and age is less than 15.

public class Q5Student {

	private int rollNo;
	private String name;
	private int age;
	private int marks;

	public Q5Student(int rollNo, String name, int age, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getMarks() {
		return marks;
	}

	
	public static void main(String[] args) {

		Q5Student std[] = new Q5Student[5];
		
		std[0] = new Q5Student(10, "Ram", 14, 75);
		std[1] = new Q5Student(102, "Sahil", 17, 89);
		std[2] = new Q5Student(103, "Shital", 13, 40);
		std[3] = new Q5Student(104, "Rohit", 14, 77);
		std[4] = new Q5Student(105, "Nidhi", 13, 82);
		
		printStudnts(std);
	}
	
	
	public static void printStudnts(Q5Student std[]) {
		
		System.out.println("students who have marks more than 60 and age is less than 15: ");
		for(Q5Student s : std) {
			
			if(s.getAge()<= 15 && s.getMarks()>=60) {
				System.out.println(s.getName());
			}
			
		}
	}

}
