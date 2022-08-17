package com.javachamp.java17.features.instanceofop.examples;

public class TestClass {

	public static void main(String[] args) {

		Employee[] emp = new Employee[180];
		emp[0] = new Programmer();
		emp[1] = new Manager();
		emp[2] = new Sales();

		payEmployee(emp[0]);
		payEmployee(emp[1]);
		payEmployee(emp[2]);
	}

	private static void payEmployee(Employee employee) {

		if (employee instanceof Programmer pro) {
			pro.setIncentive(1000);
			System.out.println(pro);
		} else if (employee instanceof Manager man) {
			man.setWorkingTime("10 to 6");
			System.out.println(man);
		} else if (employee instanceof Sales sales) {
			String[] arr = { "Hindi", "Gujarati" };
			sales.setLanguagesKnown(arr);
			System.out.println(sales);
		}

	}

}
