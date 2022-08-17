package com.javachamp.java17.features.instanceofop.examples;

public class Programmer extends Employee {

	private int incentive;

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	@Override
	public String toString() {
		return "Programmer [incentive=" + incentive + "]";
	}

}
