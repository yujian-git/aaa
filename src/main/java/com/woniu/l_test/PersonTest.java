package com.woniu.l_test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
public class PersonTest {
	
	@Test
	public void deptTest() {
		ApplicationContext ac = new AnnotationConfigApplicationContext("com/woniu/l_test/ApplicationContext.xml");
		Person p = (Person)ac.getBean("person");
		System.out.println(p);
	
	}
	
	
	
}
