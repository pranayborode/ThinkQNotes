package com.assignment18abstractinterface;

abstract class Equipment {

	void fill() {
		System.out.println("Equipment is filled.");
	}

	abstract void mix();
}

public class Cement_mixer extends Equipment {

	void mix() {
		System.out.println("Cement mixing");
	}

	void pour() {
		System.out.println("Cement pouring");
	}

	public static void main(String[] args) {
		Cement_mixer cMixer = new Cement_mixer();
		cMixer.fill();
		cMixer.mix();
		cMixer.pour();
		
		System.out.println("---------------------");
		
		Equipment equ= new Cement_mixer();
		equ.fill();
		equ.mix();
		//equ.pour();

	}

}
