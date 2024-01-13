package com.asg9constructor;

// 9. Create Course class with id and name. Course also contains SubCourse object which is a class

//    containing subCourseId, subCourseName. Create default constructor for both and see each object 
//    and object constructor being called one by one. First SubCourse constructor should be called.

class SubCourse {
	private int subCourseId;
	private String subCourseName;

	public SubCourse() {
		System.out.println("SubCourse Default Constructor");
		subCourseId = 101;
		subCourseName = "Default SubCourse";
	}

}

public class Course {

	private int courseId;
	private String courseName;
	private SubCourse subCourse;

	public Course() {
		System.out.println("Course Default Constructor");
		courseId = 1001;
		courseName = "Default Course";
		subCourse = new SubCourse();
	}

	public static void main(String[] args) {

		Course c = new Course();

	}

}
