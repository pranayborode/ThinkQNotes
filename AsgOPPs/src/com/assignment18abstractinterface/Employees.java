package com.assignment18abstractinterface;

//2)You have been assigned to create a wifi which can be accessed by the employees inside a room 
//as well as the admin staff from the adjacent room.
//Protected


public class Employees {

	private int eId;
	private String eName;
	private Wify wify;

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int eId, String eName, Wify wify) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.wify = wify;
	}
	
	

	@Override
	public String toString() {
		return "Employees : eId=" + eId + ", eName=" + eName + ", \n"+ wify;
	}

	public static void main(String[] args) {
		
		Wify w1 = new Wify("JioFiber", "Admin@1234");
		
		Employees e1 = new Employees(101, "Pravin", w1);
		
		System.out.println(e1);
		
		w1.display();

		
	}

}
