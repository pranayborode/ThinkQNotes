package com.asg8oppsmethods;

//4. Show java is pass by value and not by reference. To prove
//create object of Student. Pass that object to a method.
//Change value of id in that method but dont return
//anything. Also print student object hashcode see it will be
//same as that of main method object. Now after method is
//over in main method simply print id var and see value
//would be changed. This is because student reference
//points to a memory location. That location is passed as a
//value to the local variable of the calling method. Now since
//both reference variables are pointing to same location id is
//changed and hence the output.


public class Student4 {

	private int id;
	
	public Student4(int id) {
		this.id = id;
	}
	
	public void changeId(Student4 s) {
		s.id = 999;
	}
	public static void main(String[] args) {
		
		Student4 s = new Student4(101);
		
		System.out.println("hashcode before method : "+s.hashCode());

		s.changeId(s);
		
		System.out.println("hashcode after method : "+s.hashCode());
		
		System.out.println("Id after method : "+s.id);
	}

}
