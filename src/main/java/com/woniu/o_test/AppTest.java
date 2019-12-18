package com.woniu.o_test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "app.xml")
public class AppTest {

	@Autowired
	UserServiceImpl usi;
	
	@Test
	public void test() {
		Integer i = usi.save(1);
		System.out.println(i);
	}
	

}
