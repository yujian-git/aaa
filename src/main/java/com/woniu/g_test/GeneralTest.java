package com.woniu.g_test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GeneralTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/woniu/g_test/ApplicationContext.xml");
		IGeneral ig = (IGeneral)ac.getBean("pg");
		ig.pk();
	}

}
