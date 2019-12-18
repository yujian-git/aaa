package com.woniu.n_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="applicationContext.xml")
//@ContextConfiguration(classes=MyConfig.class)
public class DeptTest {
	
	@Autowired
	Dept dept;
	
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/woniu/n_test/applicationContext.xml");
		//ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Dept dept = (Dept) ac.getBean("dept");
		System.out.println(dept);
		
		
		//System.out.println(dept);
	}

}
