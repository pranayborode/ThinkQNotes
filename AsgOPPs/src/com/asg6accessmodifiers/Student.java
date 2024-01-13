package com.asg6accessmodifiers;

/*Access modifiers 
1. Create a class Student with 4 variables called as rollNo, admissionNo, age, 
courseId. Each of the variables should have one of the access modifier: public, 
protected, no-access-modifier and private. Add 4 methods in the class: public 
method doPublic, no access modifier method doDefault, protected method 
doProtected, private method doPrivate. */

public class Student {

	public int rollNo;
	protected int admissionNo;
	int age;
	private int courseId;

	public void doPublic() {
		System.out.println("Public Method");
	}

	protected void doProtected() {
		System.out.println("Protected Method");
	}
	
	void doDefault() {
		System.out.println("Default Method");
	}

	private void doPrivate() {
		System.out.println("Private Method");
	}

}
