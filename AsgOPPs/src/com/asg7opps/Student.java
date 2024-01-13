package com.asg7opps;


//1. create class Student
//2. create 2 objects of Student using new keyword
//3. Write a program for class and object : (main method inside class)
//5. Write a program for class and object : (initialization through reference)
//   Note : Initializing object simply means storing data into object
//6. Write a program to demonstrate anonymous object.
//7. Write a program to create multiple objects of one type only.
//   e.g. Rectangle r1=new Rectangle(), r2=new Rectangle();//creating two objects
//8. print 2 objects in sysout and see its hashcode is different
//   Eg Student@15db9742 and Student@2329742
//9. If you do this Student s1 = new Student(); Student s2 = s1;
//   Now print sop(s1) sop(s2) see both reference variables are pointing to same location.
//   But if you use new keyword for s1 and s2 see both values would be different
//10. add id,name in student class. assign value to id name there itself and in main method print values. Then change value
//    of instance variables and again print the values. Observe you cannot access id directly without creating object. 
//    Also 2 objects have 2 seperate set of data

public class Student {

	int rollNO;
	String StdName;
	
	int id= 111;
    String name = "Pranay";
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		
		s1.rollNO = 101;
		s1.StdName = "Ravi";

		s2.rollNO = 102;
		s2.StdName = "Amar";
		
		new Student();  //anonymous object
		
		Student st1 = new Student();
		//st2 = new Student();
		
		System.out.println(s1); //com.assignment6opps.Student@6e8cf4c6
		System.out.println(s2); //com.assignment6opps.Student@12edcd21
		
		Student std1 = new Student();
		Student std2 = std1;
		System.out.println(std1); //com.assignment6opps.Student@34c45dca
		System.out.println(std2); //com.assignment6opps.Student@34c45dca
		
		//System.out.println(id);  //cannot access id directly without creating object
		//System.out.println(name);//cannot access name directly without creating object
		//id = 200;
		//name = "Amar";
		
		s1.id = 222;
		s1.name = "Sumit";
		
		s2.id = 333;
		s2.name = "Anup";
		
		System.out.println(s1.id+" : "+s1.name);
		System.out.println(s2.id+" : "+s2.name);
		
		System.out.println(s1.id == s2.id); // false
		System.out.println(s1.name == s2.name);// false
		
	}

}
