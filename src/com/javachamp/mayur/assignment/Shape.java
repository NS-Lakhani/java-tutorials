package com.javachamp.mayur.assignment;

public abstract class Shape {

	int width;
	int height;
	
	public Shape() {
		super();
	}

	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	abstract void calculateArea(float height, float width);
}
