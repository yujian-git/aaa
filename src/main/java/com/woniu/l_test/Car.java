package com.woniu.l_test;

public class Car {
	private String carName;

	public String getCarName() {
		return carName;
	}

	public  void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + "]";
	}
	
	
}
