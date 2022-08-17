package com.javachamp.java17.features.instanceofop.examples;

public class Manager extends Employee {

	private String workingTime;

	public String getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(String workingTime) {
		this.workingTime = workingTime;
	}

	@Override
	public String toString() {
		return "Manager [workingTime=" + workingTime + "]";
	}

}
