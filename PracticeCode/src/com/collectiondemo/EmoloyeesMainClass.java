package com.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class EmoloyeesMainClass {

	public static void main(String[] args) {
		
		ArrayList<Employees> empList = new ArrayList<>();
		
		empList.add(new Employees(101, "Ganesh", 45000));
		empList.add(new Employees(103, "Priya", 50000));
		empList.add(new Employees(102, "Amar", 33000));
		empList.add(new Employees(105, "Anuj", 45000));
		empList.add(new Employees(104, "Swapnil", 65000));
		
		for(Employees e : empList) {
			System.out.println(e);
		}

		System.out.println("---------Sort by salary----------");
		Collections.sort(empList,new  SalaryComparator());
		
		for(Employees e : empList) {
			System.out.println(e);
		}


	}

}
