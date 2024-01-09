package com.assignment20array2;


//11. WAJP2   
//a. Create a class of type Department which has an array of Students. 
//   Department has id, name and an array of Students while member variables of Student are id and name.  

//b. In the main method,  
//i. Create Department object, create 15 Student objects with 
//a unique id and assign them as array elements. 

//ii. After all the Student objects are created, print each 
//Student’s id. 

//c. In the main method, 
//i. Create an array to store 5 Department objects. Each 
//Department will have unique Id. Now, within each 
//Department create 20 students. All the 100 Students (5 
//Departments * 20 Students) should have a unique id. 
//Print each Student’s id. 


class Student{
	private int sid;
	private String sname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student : Id=" + sid + ", Name=" + sname;
	}
	
	
}

class Department {
	private int did;
	private String dname;
	Student[] students;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int did, String dname, int noOfStd) {
		super();
		this.did = did;
		this.dname = dname;
		this.students = new Student[noOfStd];
	}
	
	@Override
	public String toString() {
		return "Department : DepId=" + did + ", DepName=" + dname + ", " + students;
	}
	
	
	
}
public class Q11DepartmentStudentExample {

	
	 private static void printStudentIds(Student[] students) {
	        for (Student student : students) {
	            System.out.println("Student ID: " +student.getSid());
	        }
	    }
	
	public static void main(String[] args) {
		
//		Student std[] = new Student[15];
//		std[0] = new Student(101, "Rohit");
//		std[1] = new Student(102, "Amar");
//		std[2] = new Student(103, "Riya");
//		std[3] = new Student(104, "Sumit");
//		std[4] = new Student(105, "Radha");
//		std[5] = new Student(106, "Shraddha");
//		std[6] = new Student(107, "Yogesh");
//		std[7] = new Student(108, "Siddhi");
//		std[8] = new Student(109, "Vedant");
//		std[9] = new Student(110, "Milind");
//		std[10] = new Student(111, "Ashwini");
//		std[11] = new Student(112, "Shruti");
//		std[12] = new Student(113, "Samir");
//		std[13] = new Student(114, "Shweta");
//		std[14] = new Student(115, "Rohan");
//		
//		for(Student s: std) {
//			System.out.println(s);
//		}
		
		Department depIt = new Department(1, "IT", 15);
		 for (int i = 0; i < 15; i++) {
	            depIt.students[i]= new Student(i + 1, "Student" + (i + 1));
	        }
		 
		 System.out.println("Students Id in Department IT :");
		 printStudentIds(depIt.students);
		 
		 
		 
	}

}
