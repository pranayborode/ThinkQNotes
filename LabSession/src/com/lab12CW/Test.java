package com.lab12CW;

public class Test {

	{
		System.out.println("IIB1");
	}
	
	{
	    System.out.println("IIB2");
	}
	
	static {
		System.out.println("Static 1");
	}
	
	static {
		System.out.println("Static 2");
	}
	
	Test(){
		System.out.println("Default const");
	}
	
	public static void main(String[] args) {
		
              Test t1 = new Test();
		
	}

}
