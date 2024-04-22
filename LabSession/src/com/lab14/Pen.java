package com.lab14;

class Pen {

	private Refill refill;
	private double capLength;
	private String brand;

	public Pen(Refill refill, double capLength, String brand) {
		this.refill = refill;
		this.capLength = capLength;
		this.brand = brand;
	}

	public Refill getRefill() {
		return refill;
	}

	public void setRefill(Refill refill) {
		this.refill = refill;
	}

	public double getCapLength() {
		return capLength;
	}

	public void setCapLength(double capLength) {
		this.capLength = capLength;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Pen : refill=" + refill + ", capLength=" + capLength + ", brand=" + brand;
	}
	
	public static void main(String[] args) {
		 Nib nib = new Nib("Steel", 0.5);
		 
		 Refill refill = new Refill("Blue", 10.0, nib);
		 
		 Pen pen = new Pen(refill, 4.0,"Cello" );
		 
		 System.out.println(pen);
		 pen.toString();
	}

}
