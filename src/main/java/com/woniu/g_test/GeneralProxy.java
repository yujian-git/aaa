package com.woniu.g_test;

public class GeneralProxy implements IGeneral {
	IGeneral general = new General();
	
	public GeneralProxy() {
		super();
	}

	public GeneralProxy(IGeneral general) {
		super();
		this.general = general;
	}

	@Override
	public void pk() {
		System.out.println("穿好战袍上马");
		general.pk();
		System.out.println("脱下战袍下马");
	}

}
