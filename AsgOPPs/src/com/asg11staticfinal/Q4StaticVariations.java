package com.asg11staticfinal;

//4. Check following variations:
//a.	Static variable and Non-Static (Instance Variable) – Just declare and print it.
//b.	See if you can access static variable in static method
//c.	non static variable in static method
//d.	then static variable in non-static method
//e.	non static variable in non-static method Note: non static means instance variable


public class Q4StaticVariations {

	int a = 10;
	static int b = 20;
	
	void nonStaticMehtod() {
		System.out.println("Non-staticVer - in non-static method : "+a); // non-static
		System.out.println("StaticVer - in non-static method : "+b); // static
	}
	
	static void staticMethod() {
	//	System.out.println(a); // we can't access non-static variables in static mehtod 
		System.out.println("StaticVer - in Static method : "+b); // static
		
		// But we can access non-static variables by creating class instance
		Q4StaticVariations s2 = new Q4StaticVariations();
		System.out.println("non-StaticVer - in Static method : "+s2.a);
		
	}
	
	public static void main(String[] args) {
		
		Q4StaticVariations s1 = new Q4StaticVariations();
		s1.nonStaticMehtod();
		
		staticMethod();
		//StaticVariations.staticMethod();
		//The static method staticMethod() from the type StaticVariations should be accessed in a static way
		
		Q4StaticVariations s3 = new Q4StaticVariations();
				
		System.out.println("non-static in main method : "+s3.a);
		System.out.println("static in main method : "+Q4StaticVariations.b);
	}

}
