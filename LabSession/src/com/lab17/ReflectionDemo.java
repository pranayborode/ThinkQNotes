package com.lab17;

public class ReflectionDemo {

	private String s;
	
	public ReflectionDemo() {
		s = "REflection Example";
	}
	
	public void method1() {
		System.out.println("The string is "+s);
	}
	
	public void mehtod2(int n) {
		System.out.println("The number is "+n);
	}
	
	private String mehtod3() {
		System.out.println("Private method invoked");
		return s;
	}
	public static void main(String[] args) {
	 ReflectionDemo rd = new ReflectionDemo();
	 
	 rd.mehtod3();
		
	}

}
