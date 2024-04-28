package com.cw;

interface Movie {
	
	void movie(String name);
}

public class InterfaceLambdaExample implements Movie {

	
	@Override
	public void movie(String name) {
		
		System.out.println("Movie name is "+name);
	}
	
	public static void main(String[] args) {
		
		Movie hindi = (name)->{System.out.println("Movie name is "+name);};
		hindi.movie("Tumbad");
		
		Movie marathi = (name)->{System.out.println("Movie name is "+name);};
		marathi.movie("Kasav");
	}

	

}
