package com.woniu.a_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/woniu/a_test/applicationContext.xml");
		User user1 = (User) ac.getBean("user");
		User user2 = (User) ac.getBean("user");
		System.out.println(user1==user2);
		
	}



}
