package com.lab14;

public class Refill {

	private String inkColor;
	private double length;
	private Nib nib;
	
	public Refill() {
		super();
	}

	public Refill(String inkColor, double length, Nib nib) {
		super();
		this.inkColor = inkColor;
		this.length = length;
		this.nib = nib;
	}

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Nib getNib() {
		return nib;
	}

	public void setNib(Nib nib) {
		this.nib = nib;
	}

	@Override
	public String toString() {
		return "Refill : inkColor=" + inkColor + ", length=" + length + ", " + nib;
	}
	
	
	
	
	
}
