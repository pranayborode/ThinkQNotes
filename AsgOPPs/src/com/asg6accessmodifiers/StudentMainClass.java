package com.asg6accessmodifiers;


// a. In main method outside the class but in same package – create object of type Student.

//i. Try to access all the variables and all the methods in it. Verify the visibility against the access modifier table. 

 
public class StudentMainClass {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.rollNo = 101;        // Public 
		s1.admissionNo = 2001;  // protected
		s1.age = 16;            // Default
		//s1.courseId;  // Private not accessible within same package different class
		System.out.println(s1.rollNo);
		System.out.println(s1.admissionNo);
		System.out.println(s1.age);
		
		s1.doPublic();
		s1.doProtected();
		s1.doDefault();
		//s1.doPrivate(); // Private Method not accessible within same package different class

	}

}
