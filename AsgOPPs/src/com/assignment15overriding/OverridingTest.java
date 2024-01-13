package com.assignment15overriding;


class Derived  
{ 
    public void getDetails(String temp) 
    { 
        System.out.println("Derived class " + temp); 
    } 
} 

public class OverridingTest {

    public int getDetails(String temp) 
    { 
        System.out.println("OverridingTest class " + temp); 
        return 0; 
    } 

	public static void main(String[] args) {
		
		OverridingTest obj = new OverridingTest(); 
        obj.getDetails("Hello"); 


	}

}
