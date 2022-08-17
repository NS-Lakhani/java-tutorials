package com.javachamp.mayur.assignment;

public class Triangle extends Shape {

	public Triangle(int width, int height) {
		super(width, height);
	}

	public Triangle() {}

	@Override
	void calculateArea(float height, float width) {
		System.out.println("Area of triangle is : " + (height * width)/2);
	}

}
