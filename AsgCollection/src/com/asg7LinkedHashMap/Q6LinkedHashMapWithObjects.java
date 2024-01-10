package com.asg7LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//6. WAP to create a LinkedHashMap which contains Strings as key 
//   and objects of different classes as value. 
//   Print the map contents and observe the order.

class Value1 {

	private int id;
	private String name;

	public Value1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Value1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Value1 [id=" + id + ", name=" + name + "]";
	}

}

class Value2 {

	private int id;
	private String name;

	public Value2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Value2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Value2 [id=" + id + ", name=" + name + "]";
	}

}

public class Q6LinkedHashMapWithObjects {

	public static void main(String[] args) {

		LinkedHashMap<String, Object> lhm = new LinkedHashMap<>();

		lhm.put("One", new Value1(1, "Value1"));
		lhm.put("Two", new Value2());
		lhm.put("Three", "String");
		lhm.put("Four", 1234);

		Set<Entry<String, Object>> entries = lhm.entrySet();

		for (Map.Entry<String, Object> e : entries) {
			System.out.println("Key : " + e.getKey() + " ==> " + "Value : " + e.getValue());
		}

	}

}
