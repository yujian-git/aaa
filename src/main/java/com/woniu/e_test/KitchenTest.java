package com.woniu.e_test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KitchenTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/woniu/e_test/ApplicationContext.xml");
		Kitchen k = (Kitchen)ac.getBean("k");
		k.cook();
	}

}
