package com.woniu.p_test;

public class MyAop {
	public void before() {
		System.out.println("MyAop.before()");
	}
	
	public void around() {
		System.out.println("MyAop.around()");
	}
	
	public void afterReturning() {
		System.out.println("MyAop.afterReturning()");
	}
	
	public void throwExecption() {
		System.out.println("MyAop.throwExecption()");
	}
	
	public void after() {
		System.out.println("MyAop.after()");
	}
	
}
