package com.woniu.e_test;

public class Factory {
	public static Kitchen getKitchen(Integer i) {
		Kitchen kitchen = null;
		switch (i) {
		case 1:
			kitchen = new Fish();
			break;
		case 2:
			kitchen = new Meat();
			break;	
		}
		return kitchen;
	}
	
	
}
