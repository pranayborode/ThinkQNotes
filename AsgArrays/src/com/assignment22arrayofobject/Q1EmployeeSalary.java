package com.assignment22arrayofobject;

//1.	WAP to print the employees from Employee[] array who has same salary 
//(Create Employee class which has 3 attributes id, name, salary and add employee objects to your array)

class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

}

public class Q1EmployeeSalary {

	public static void printEmployeesWithSameSalary(Employee emp[]) {

		for (int i = 0; i < emp.length - 1; i++) {

			for (int j = i + 1; j < emp.length; j++) {

				if (emp[i].getSalary() == emp[j].getSalary()) {
					System.out.println(emp[i].getName() + " and " + emp[j].getName() 
							+ " have same salary: "+emp[i].getSalary());
				}
			}
		}

	}

	public static void main(String[] args) {
		Employee emp[] = new Employee[5];

		emp[0] = new Employee(101, "Tushar", 5000);
		emp[1] = new Employee(102, "Shreyash", 6000);
		emp[2] = new Employee(103, "Shreya", 7000);
		emp[3] = new Employee(104, "Pravin", 5000);
		emp[4] = new Employee(105, "Radha", 6000);

		printEmployeesWithSameSalary(emp);
	}

}
