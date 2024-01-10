package com.asg2comparator;

import java.util.ArrayList;
import java.util.Collections;

//10. WAP to create a class Student with (rollNo, nameand age). 
//    Create 3 Comparator implementations for each Student attribute (i.e. rollNo, name and age)
//11. Create and add 4 Student objects in ArrayList. Print ArrayList.
//12. Sort the list using rollno comparator. Print ArrayList.
//13. Sort the list using name comparator. Print ArrayList.
//14. Sort the list using age comparator. Print ArrayList.
//15. Observe the sorted outputs in case the name, age and name + age are same.
public class Student {

	private int rollNo;
	private String name;
	private int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Q10Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		ArrayList<Student> stdList = new ArrayList<>();

		stdList.add(new Student(102, "Ravi", 17));
		stdList.add(new Student(105, "Arun", 14));
		stdList.add(new Student(101, "Shital", 16));
		stdList.add(new Student(103, "Yash", 18));
		stdList.add(new Student(107, "Ganesh", 15));
		stdList.add(new Student(104, "Riya", 16));
		stdList.add(new Student(106, "Ganesh", 17));

		System.out.println("_____________________Original List________________________");
		for (Student s : stdList) {
			System.out.println(s);
		}

		
		
		System.out.println("_____________________RollNO________________________");
		Collections.sort(stdList, new RollNoComparator());

		for (Student s : stdList) {
			System.out.println(s);
		}

		System.out.println("_____________________Name________________________");
		Collections.sort(stdList, new NameComparator());

		for (Student s : stdList) {
			System.out.println(s);
		}
		
		System.out.println("_____________________Age________________________");
		Collections.sort(stdList, new AgeComparator());
		for (Student s : stdList) {
			System.out.println(s);
		}
		
		System.out.println("_____________________Name Age________________________");
		Collections.sort(stdList, new NameAgeComparator());
		for (Student s : stdList) {
			System.out.println(s);
		}

	}

}
