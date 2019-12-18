package com.woniu.k_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
public class DeptTest {
	
	@Test
	public void deptTest() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Dept dept = (Dept)ac.getBean("getDept");
		dept.setName("²ÆÎñ²¿");
		System.out.println(dept.getName());
	}
	
	
//	@Test
//	public void deptTest() {
//		
//	}
	
	
	
}
