package com.assignment19array1;



//19. WAP to print the employees from Employee[] array who has same salary (Create 
//Employee class which has 3 attributes id, name, salary and add employee objects to 
//your array)  

public class Q18Employee {

	private int id;
	private String name;
	private double salary;

	public Q18Employee(int id, String name, double salary) {
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

	public static void employeesWithSameSalary(Q18Employee[] employee) {

		for (int i = 0; i < employee.length-1 ; i++) { // we don't need to check last element

			for (int j = i + 1; j < employee.length; j++) {

				if (employee[i].getSalary() == employee[j].getSalary()) {

					System.out.println("Employee with same Salary : ");
					System.out.println(employee[i]);
					System.out.println(employee[j]);
					System.out.println("-----------------------");

				}
			}
		}

	}

	@Override
	public String toString() {
		return "Q18Employee : id=" + id + ", name=" + name + ", salary=" + salary;
	}

	public static void main(String[] args) {

		Q18Employee[] employee = new Q18Employee[] { new Q18Employee(101, "Pranay", 2000),
				new Q18Employee(102, "Ravi", 4000), new Q18Employee(103, "Satish", 7000),
				new Q18Employee(104, "Riya", 2000), new Q18Employee(105, "Shital", 7000),
				new Q18Employee(105, "Anup", 2000)

		};

		employeesWithSameSalary(employee);
	}

}
