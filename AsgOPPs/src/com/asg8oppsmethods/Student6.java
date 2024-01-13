package com.asg8oppsmethods;

import java.util.Scanner;

//7) Create class student and write a meaningful program with 3 methods (1 with return type 
//(calculating percentage), 1 without return
//type (displaying student data), 1 with parameter list).

public class Student6 {

	private String name;
	private int mathMarks;
	private int scienceMarks;
	private int englishMarks;

	public double calcPercentage() {

		return (mathMarks + scienceMarks + englishMarks) / 3;
	}

	public void displayStudentData() {
		System.out.println("Student Data:");
		System.out.println("Name : " + name);
		System.out.println("Math Marks : " + mathMarks);
		System.out.println("Science Marks : " + scienceMarks);
		System.out.println("English Marks : " + englishMarks);
	}

	public void setStudentData(String studentName, int math, int science, int english) {
		name = studentName;
		mathMarks = math;
        scienceMarks = science;
        englishMarks = english;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student6 s =new Student6();
		
		System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter math marks: ");
        int mathMarks = sc.nextInt();
        
        System.out.print("Enter science marks: ");
        int scienceMarks = sc.nextInt();

        System.out.print("Enter english marks: ");
        int englishMarks = sc.nextInt();
        
        s.setStudentData(studentName, mathMarks, scienceMarks, englishMarks);
        
        s.displayStudentData();
        
        System.out.println("Percentage: " + s.calcPercentage() + "%");
        
        sc.close();
       
	}

}
