package com.assignment15overriding;


//5)WAP to create class Programmer with Method workingHours().
//create class Employee which extends Programmer implement workingHours()differently in child.


class Programmer{
	
	public void workingHours() {
		System.out.println("Programmer working 8 hours a day");
	}
}

class Employee extends Programmer {
	
	public void workingHours() {
		System.out.println("Employee working 9 hours a day");
	}
}

public class ProgrammerExample {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.workingHours();

	}

}
