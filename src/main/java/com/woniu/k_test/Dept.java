package com.woniu.k_test;

public class Dept {
	private String name;
	private Car car;

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}
	
	public final Car getCar() {
		return car;
	}

	public final void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Dept [name=" + name + ", car=" + car + "]";
	}
	
}
