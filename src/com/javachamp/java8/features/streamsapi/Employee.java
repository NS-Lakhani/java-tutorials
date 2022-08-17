package com.javachamp.java8.features.streamsapi;

public class Employee {

	private int id;
	private String name;
	private long salary;
	private String grade;

	public Employee() {
		super();
	}

	public Employee(int id, String name, long salary, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", grade=" + grade + "]";
	}

}
