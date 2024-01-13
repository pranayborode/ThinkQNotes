package com.asg9constructor;

// 12. Design a class to overload a function series() as follows:
// (i) double series(double n) with one double argument and returns the sum of the series, 
//     sum = 1 / 1 + 1 / 2 + 1 / 3 + … + 1 / n.
// (ii)double series(double a, double n) with two double arguments and returns the sum of the series, 
//     sum = 1 / a2 + 4 / a5 + 7 / a8 + 10 / a11 + … to n terms.
//

public class SeriesCalculator {

	public double series(double n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}
		return sum;
	}

	public double series(double a, double n) {
		double sum = 0;
		int x = 1;
		
		for (int i = 1; i <= n; i++) {
			int e = x + 1;
			double term = x / Math.pow(a, e);
			sum += term;
			x += 3;

		}
		return sum;
	}

	public static void main(String[] args) {
		
		SeriesCalculator s1 = new SeriesCalculator();
		
		System.out.println("Sum of Series1 : "+s1.series(5));
		
		System.out.println("Sum of Series2 : "+s1.series(2.0, 3));

	}

}
