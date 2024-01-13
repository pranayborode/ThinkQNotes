package com.asg14containment;

//1. WAP to have Department class created with id, name . Student class has
//roll, name and Department object should have id and name. Assign and
//print individual values in main method


public class Student {

	private int rollNo;
	private String sname;
	private Department department;

	public Student() {

	}

	public Student(int rollNo, String sname, Department department) {
		this.rollNo = rollNo;
		this.sname = sname;
		this.department = department;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public String toString() {
		return "Student : rollNo=" + rollNo + ", name=" + sname + ", " + department;
	}

	public static void main(String[] args) {

		Department d1 = new Department(1, "MBA");
		Department d2 = new Department(2, "Engineering");

		Student s1 = new Student(101, "Pranay", d2);
		Student s2 = new Student(102, "Rohit", d1);

		System.out.println(s1);
		System.out.println(s2);

		System.out.println("-------------------");

		Student s3 = new Student(103, "Shital", new Department(3, "Poly"));

		System.out.println(s3);

		System.out.println("-------------------");

		Department d = new Department();
		d.setDid(4);
		d.setDname("MSc");

		Student s = new Student();
		s.setRollNo(104);
		s.setSname("Sumit");
		s.setDepartment(d);

		System.out.println(s);

		System.out.println("-------------------");

		Student std = new Student();

		std.setRollNo(105);
		std.setSname("Swapnil");

		std.setDepartment(new Department());
		std.getDepartment().setDid(5);
		std.getDepartment().setDname("LifeScience");

		System.out.println(std);

	}

}
