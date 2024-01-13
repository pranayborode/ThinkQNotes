package com.asg12inheritance;


//7.Create interface IceCream with method eat and Juice with method drink.  
//  Create class Mastani which implements both interfaces.


interface IceCream{
	void eat();
}

interface Juice{
	void drink();
}

class Mastani implements IceCream, Juice{
	
	public void eat() {
		System.out.println("Mastani contain IceCream");
	}
	
	public void drink() {
		System.out.println("Mastani contain Juice");
	}
}

public class MastaniMain {

	public static void main(String[] args) {
		
		Mastani m = new Mastani();
		m.eat();
		m.drink();
		

	}

}
