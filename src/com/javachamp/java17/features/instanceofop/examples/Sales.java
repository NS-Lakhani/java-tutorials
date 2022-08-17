package com.javachamp.java17.features.instanceofop.examples;

import java.util.Arrays;

public class Sales extends Employee {

	private String[] languagesKnown;

	public String[] getLanguagesKnown() {
		return languagesKnown;
	}

	public void setLanguagesKnown(String[] languagesKnown) {
		this.languagesKnown = languagesKnown;
	}

	@Override
	public String toString() {
		return "Sales [languagesKnown=" + Arrays.toString(languagesKnown) + "]";
	}

}
