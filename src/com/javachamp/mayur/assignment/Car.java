package com.javachamp.mayur.assignment;

public class Car {

	private String carName;
	private String carModel;
	private String carManufacturer;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarManufacturer() {
		return carManufacturer;
	}

	public void setCarManufacturer(String carManufacturer) {
		this.carManufacturer = carManufacturer;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carModel=" + carModel + ", carManufacturer=" + carManufacturer + "]";
	}

	public static void main(String[] args) {
		
		Car tata = new Car();
		tata.setCarName("Tata Altroz");
		tata.setCarModel("XM");
		tata.setCarManufacturer("Tata Motors");
		
		Car hyundai = new Car();
		hyundai.setCarName("Hyundai i20");
		hyundai.setCarModel("Asta");
		hyundai.setCarManufacturer("Hyundai");
		
		Car ford = new Car();
		ford.setCarName("Ford Ecosport");
		ford.setCarModel("Titanium Plus");
		ford.setCarManufacturer("Ford Motors");
		
		System.out.println(tata.toString());
		System.out.println(hyundai.toString());
		System.out.println(ford.toString());
	}

}
