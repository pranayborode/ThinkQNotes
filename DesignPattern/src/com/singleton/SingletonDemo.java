package com.singleton;

public class SingletonDemo {

	//private static SingletonDemo obj; //lazy  //---1

	private static SingletonDemo obj = new SingletonDemo(); // early //---1

	public String msg;

	private SingletonDemo() {  //---2

		msg = "Welcome";
	}

	public static SingletonDemo getInstance() {  //---3
		if (obj == null)
			obj = new SingletonDemo();

		return obj;
	}
}
