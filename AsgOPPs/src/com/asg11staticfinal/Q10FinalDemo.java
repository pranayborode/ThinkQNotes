package com.asg11staticfinal;


//10.	Create a class FinalDemo. In class Final Demo, declare a member variable x of type int. 
//      Declare it as final. In main method,
//   a.	create an object of type FinalDemo. Try to change the value of x.
//   b.	Now declare and implement a method method2 and make it final. 
//      Create a class FinalDemoChild which extends Final Demo. In FinalDemoChild, try to override the method method2
//   c.	Now declare the class FinalDemoChild as final and try to extend the class FinalDemoChild


public class Q10FinalDemo {

	final int x = 10;
	
	final void method2() {
		System.out.println("Final method2");
	}
	
	public static void main(String[] args) {
		Q10FinalDemo fd = new Q10FinalDemo();   //a. object of type FinalDemo
	//	fd.x = 20;   //The final field Q10FinalDemo.x cannot be assigned  
		fd.method2();
	}
}

final class FinalDemoChild extends Q10FinalDemo {
//	final void method2() {                            //Cannot override the final method from Q10FinalDemo
//		System.out.println("Final method2");
//	}	
}
//class finalDemoSubChild extends FinalDemoChild{  //The type finalDemoSubChild cannot subclass the final class FinalDemoChild
//	
//}