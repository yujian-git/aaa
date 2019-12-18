package com.woniu.e_test;

public interface Kitchen {
	Integer TYPE_FISH=1;
	Integer TYPE_MEAT=2;
	void cook();
}

class Fish implements Kitchen {
	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("×öËá²ËÓã");
	}
}

class Meat implements Kitchen {
	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("×öºìÉÕÈâ");
	}
}