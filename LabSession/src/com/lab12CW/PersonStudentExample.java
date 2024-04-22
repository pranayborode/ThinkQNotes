package com.lab12CW;

class Person {

	private String personName;
	private int personAge;

	public Person() {

	}

	public Person(String personName, int personAge) {
		super();
		this.personName = personName;
		this.personAge = personAge;
	}
	
	
	public void show() {
		System.out.println("In Parent Class");
		System.out.println("Person Name : "+this.personName+ "  Age : "+this.personAge);
		
	}
	

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	
	
}

class Student extends Person{
	
	private int rollNumber;

	public Student() {
		super();
	}

	public Student(String personName, int personAge, int rollNumber ) {
		super(personName, personAge);
		this.rollNumber = rollNumber;
		
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	
	public String toString() {
		return super.toString()+", Student : rollNumber=" + rollNumber;
	}
		
	
}


public class PersonStudentExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("Ram", 25);
		p1.show();
		
		Student s1 = new Student("Ravi", 17, 101);
		Student s2 = new Student("Arnav", 15, 102);
		Student s3 = new Student("Riya",15, 103);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		s1.show();

	    
	}

}
