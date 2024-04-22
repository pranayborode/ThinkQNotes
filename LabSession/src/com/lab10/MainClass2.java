package com.lab10;

public class MainClass2 {

	double overloadedMehod(double d) {
		return d*= d;
	}
	
	int overloadedMehod(int i) {
		return overloadedMehod(i*=i);
	}
	
	float overloadedMehod(float f) {
		return overloadedMehod(f *=f);
	}
	
	
	
	public static void main(String[] args) {
		
		MainClass2 main = new MainClass2();
		
		System.out.println(main.overloadedMehod(100));

	}

}
