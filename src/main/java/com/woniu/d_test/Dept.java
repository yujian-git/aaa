package com.woniu.d_test;

public class Dept {
	private int did;
	private String dname;
	
	
	
	
	public Dept(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public Dept() {
		super();
	}
	public final int getDid() {
		return did;
	}
	public final void setDid(int did) {
		this.did = did;
	}
	public final String getDname() {
		return dname;
	}
	public final void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}
	
	
}
