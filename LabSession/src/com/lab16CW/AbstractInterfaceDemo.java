package com.lab16CW;


abstract class Tree{
	abstract void leaf();
	
}


abstract class Flower extends Tree{
    abstract void colour();	
}

interface SmallFlower {
	void size();
}

interface BigFlower extends SmallFlower{
	void big();
}


public class AbstractInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
