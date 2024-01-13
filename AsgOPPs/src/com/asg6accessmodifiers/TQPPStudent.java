package com.asg6accessmodifiers;


//b. In same package as Student, create a new class TQPPStudent and extend the Student class. 

/*i. Create a method called as checkStudentVariableAccess in TQPPStudent and try 
to assign values to the inherited variables in the method. Verify the visibility 
against the access modifier table. */

/*ii. Create a method called as checkStudentMethodAccess in TQPPStudent and try 
to call the inherited methods in the method. Verify the visibility against the access 
modifier table*/

public class TQPPStudent extends Student{

	public void checkStudentVariableAccess() {
		
		rollNo = 103;        // public 
		admissionNo = 2002;  // protected
		age = 16;            // default
		//courseId = 1234;  // Private we can't access outside the different class 
		
		
	}
	
	public void checkStudentMethodAccess() {
		doPublic();
		doProtected();
		doDefault();
		//doPrivate();  //Private Method we can't access outside the different class
	}
	
	
}
