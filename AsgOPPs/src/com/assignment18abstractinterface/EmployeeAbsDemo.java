package com.assignment18abstractinterface;

public class EmployeeAbsDemo extends WifyAbsDemo {

	private int eId;
	private String eName;

	public EmployeeAbsDemo(String wifyName, String password, int eId, String eName) {
		super(wifyName, password);
		this.eId = eId;
		this.eName = eName;
	}

	@Override
	protected void accessWify() {
		System.out.println("Wify Access By : " + eName);

	}

	@Override
	public String toString() {
		return "EmployeeAbsDemo : eId=" + eId + ", eName=" + eName + super.toString();
	}

	public static void main(String[] args) {

		EmployeeAbsDemo e1 = new EmployeeAbsDemo("Jio", "1234", 101, "Rahul");
		System.out.println(e1);

		e1.accessWify();

	}

}
