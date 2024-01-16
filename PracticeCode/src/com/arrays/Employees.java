package com.arrays;



public class Employees {
	private int id;
	private String name;
	private double salary;

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
	
		Employees [] emp = new Employees[] {
				new Employees(101, "Pranay", 2000),
				new Employees(102, "Ravi", 4000), 
				new Employees(103, "Satish", 7000),
				new Employees(104, "Riya", 2000),
				new Employees(105, "Shital", 7000),
				new Employees(105, "Anup", 2000)
		};
		
	
		empWithSameSalary(emp);
		

	}
	
	static void empWithSameSalary(Employees emp []) {
		
		for(int i = 0; i<emp.length-1; i++) {
			
			for(int j = i+1; j<emp.length; j++) {
				
				if(emp[i].getSalary()==emp[j].getSalary()) {
					
					System.out.println("Employees with same salary");
					System.out.println(emp[i]);
					System.out.println(emp[j]);
					System.out.println("------------------------------------");
				}
			}
		}
		
	}

}
