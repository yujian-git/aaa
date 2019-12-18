package com.woniu.f_test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/woniu/f_test/applicationContext.xml");
		User user = (User)ac.getBean("user");
		System.out.println(user);
	}
	
	
	
	
}
