package com.asg6otherpackage;

import com.asg6accessmodifiers.Student;
import com.asg6accessmodifiers.TQPPStudent;

//c. In another package, create a new class OtherPackageStudent and extend the Student class. 

/*i. Create a method called as checkStudentVariableAccess in Student and try to 
assign values to the inherited variables in the method. Verify the visibility against 
the access modifier table.*/

/*ii. Create a method called as checkStudentMethodAccess in Student and try to call 
the inherited methods in the method. Verify the visibility against the access 
modifier table. 
*/
public class OtherPackageStudent extends Student{

	public void checkStudentVariableAccess() {

		rollNo = 103;
		admissionNo = 2002;
		//age = 16;         // Default we can't access outside the package 
		//courseId = 1234;  // Private we can't access inside the same package of different class 
	}
	
	public void checkStudentMethodAccess() {
			
		doPublic();
		doProtected();      // Protected method can be access outside the package only within child class of parent class
		//doDefault()       // Default Method we can't access outside the package 
		//doPrivate();      // Private Method we can't access inside the same package of different class 
	}
	
	public static void main(String[] args) {
		
//		d. In main method outside the class but in some other package – create object of type Student. 	
//		i. Try to access all the variables and all the methods in it. Verify the visibility against the access modifier table. 
		
		Student s1 = new Student();
		
		s1.rollNo = 111;
		//s1.admissionNo = 2222; // we can't access by calling parent class object 
		//s1.age = 16;
		//s1.courseId;
		
		s1.doPublic();
		//s1.doProtected();     // we can't access by calling parent class object 
		//s1.doDefault();
		//s1.doPrivate();
		
		
//		e. In main method outside the class but in some other package – create object of type TQPPStudent.
//		i. Try to access all the variables and all the methods in it. Verify the visibility against the access modifier table. 
		
		TQPPStudent t1 = new TQPPStudent();
		
		t1.rollNo = 222;
		//t1.admissionNo = 2222;
		//t1.age = 17;
		//t1.courseId = 555;
		
		t1.doPublic();
		//t1.doProtected();
		//t1.doDefault();
		//t1.doPrivate();
		
//		f. In main method outside the class but in some other package – create object of type OtherPackageStudent. 
//		g. Try to access all the variables and all the methods in it. Verify the visibility against the access modifier table. 
		
		OtherPackageStudent o1 = new OtherPackageStudent();

		o1.rollNo = 222;
		o1.admissionNo = 2222;  //can be access outside the package only within child class of parent class
		//o1.age = 17;
		//o1.courseId = 555;
		
		o1.doPublic();
		o1.doProtected();       //can be access outside the package only within child class of parent class
		//o1.doDefault();
		//o1.doPrivate();
	}

}
