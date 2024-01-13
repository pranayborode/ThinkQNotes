package com.asg7opps;

// 13)Create class Box and calculate the volume of box volume=length x width x height
public class Q13Box {

	public void calcVolume(int l, int w, int h) {

		double volume = l * w * h;
		System.out.println("Volume of Box : " + volume);
	}

	public static void main(String[] args) {

		Q13Box b1 = new Q13Box();
		b1.calcVolume(12, 14, 16);

	}

}
