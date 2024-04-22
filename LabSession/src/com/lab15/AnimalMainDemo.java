package com.lab15;

abstract class Animals {

	abstract void voice();

}

class Cats extends Animals {

	@Override
	void voice() {
		System.out.println("Cats meow");

	}
}

class Dogs extends Animals {

	@Override
	void voice() {
		System.out.println("Dogs bark");

	}
}

public class AnimalMainDemo {

	public static void main(String[] args) {

		Cats c = new Cats();
		c.voice();

		Dogs d = new Dogs();
		d.voice();
	}

}
