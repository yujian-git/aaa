package com.woniu.l_test;

public class Person {
	private String personName;
	private Car mycar;
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public Car getCar() {
		return mycar;
	}

	public void setCar(Car car) {
		this.mycar = car;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", mycar=" + mycar + "]";
	}

	

	
	
	
	
}
