package com.javachamp.mayur.assignment;

public class Rectangle extends Shape {

	public Rectangle() {
		super();
	}

	@Override
	void calculateArea(float height, float width) {
		System.out.println("Area of rectangle is : " + width * height);
	}

}
