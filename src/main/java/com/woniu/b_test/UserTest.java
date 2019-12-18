package com.woniu.b_test;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class UserTest {
	
	@Test
	public void test() {
		//ApplicationContext ac = new ClassPathXmlApplicationContext("com/woniu/b_test/applicationContext.xml");
		FileSystemResource fileSystemResource = new FileSystemResource("C:/STS/SpringTest/src/main/java/com/woniu/b_test/applicationContext.xml");
				
		BeanFactory bf = new XmlBeanFactory(fileSystemResource);
		/**
		 * ͨ������������ʵ��
		 */
		//User user1 = (User) ac.getBean("user1");
		//User user2 = (User) ac.getBean("user2");
		//System.out.println(user1==user2);
		
		/**
		 * ͨ����̬��������ʵ��
		 */
		//User user3 = (User)ac.getBean("user3");
		//System.out.println(user3);
		
		/**
		 * ͨ��ʵ����������ʵ��
		 */
		User user = (User)bf.getBean("user4");
		System.out.println(user);
		
	}



}
