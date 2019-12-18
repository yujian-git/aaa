package com.woniu.i_test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/woniu/i_test/ApplicationContext.xml");
		UserAction ua = ac.getBean(UserAction.class);
		ua.save();
	}

}
