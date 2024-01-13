package com.asg12inheritance;


//6.Create interface Cake with a method declared as bake. 
//  Create 2 classes Strawberry, BlackForest both implementing Cake interface.

interface Cake{
	void bake(); // in interface we only declare method dosn't implement .. 
	             // implementation is the responsibility of child classes 
}

class Strawberry implements Cake{
	public void bake() {
		System.out.println("Strawberry Cake");
	}
}

class BlackForest implements Cake{
	public void bake() {
		System.out.println("BlackForest Cake");
	}
}
public class CakeMain {

	public static void main(String[] args) {
		Strawberry s = new Strawberry();
		BlackForest b = new BlackForest();
		
		s.bake();
		b.bake();

	}

}
