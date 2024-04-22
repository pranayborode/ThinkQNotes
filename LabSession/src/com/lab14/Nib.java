package com.lab14;

public class Nib {

	private String materialType;
	private double width;

	public Nib(String materialType, double width) {
		super();
		this.materialType = materialType;
		this.width = width;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Nib : materialType=" + materialType + ", width=" + width;
	}
	
	

}
