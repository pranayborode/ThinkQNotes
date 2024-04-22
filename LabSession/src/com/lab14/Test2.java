package com.lab14;

public class Test2 {

	protected static final boolean bool = true;
	
	Test2(final boolean obj){
		Boolean bool = new Boolean(obj);
		
		bool = this.bool;
		printit(bool);
	}
	
	private void printit(boolean val) {
		System.out.println("value of variable bool is "+!val);
	}
	
	public static void main(String[] args) {
	
	//	new Test(new Boolean(!true)); //The constructor Test(Boolean) is undefined

	}

}
