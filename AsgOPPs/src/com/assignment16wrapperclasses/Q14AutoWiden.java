package com.assignment16wrapperclasses;

//14.	Class AutoWiden can have any 2 of following methods.
//public void showNum(Number i)
//public void showNum(int i)
//public void showNum(Integer i)
//public void showNum(Long i)
//public void showNum(long i)
//public void showNum(Double i)
//Select different combination of any 2 methods from above list and check 
//which methods are given priority and which methods cause errors 
//when these methods called as follows from main method. 
//{ int I = 50 ; AutoWiden a = new AutoWidern(); a.showNum(i);}


public class Q14AutoWiden {

//	public void showNum(Number i) {
//        System.out.println("Method with Number parameter: " + i);
//    }
	
//	public void showNum(int i) {
//        System.out.println("Method with int parameter: " + i);
//    }
	
	public void showNum(Integer i) {
		System.out.println("Method with Integer parameter: " + i);
	}
	
//	public void showNum(Long i) {
//		System.out.println("Method with Long parameter: " + i);
//	}
	
	public void showNum(long i) {
		System.out.println("Method with long parameter: " + i);
	}
	
//	public void showNum(Double i) {
//		System.out.println("Method with Double parameter: " + i);
//	}
	public static void main(String[] args) {
	
		 
	        Q14AutoWiden a = new Q14AutoWiden();
	        
	        int i = 50;
	        a.showNum(i);
	        
	        //Number - int -->int
	        //Number - Integer --> Integer
	        //Number - Long -->Long
	        //Number - long -->long
	        //Number - Double --> Number
	        
	        //int - Integer --> int
	        //int - Long    --> int 
	        //int - long    --> int 
	        //int - double  --> int 
	        
	        //Integer - Long --> Integer
	        //Integer - long --> long
	        
	}

}
