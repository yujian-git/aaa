package com.woniu.c_test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/woniu/c_test/applicationContext.xml");
		
		/**
		 * ������ע����ϰ
		 */
		
		//������(��ֵ)ע����ϰ
		//User user = (User)ac.getBean("t11");
		//System.out.println(user.getUser_name());
		
		//������(˫ֵ)ע����ϰ
		//User user = (User)ac.getBean("t12");
		//System.out.println(user.getUser_name());
		//System.out.println(user.getUser_role());
		
		//����ʵ������ע����ϰ
		//User user = (User)ac.getBean("t13");
		//System.out.println(user);
		
		
		/**
		 * setter����ע����ϰ
		 */
		//setter������ͨ����ע��
		//User user = (User)ac.getBean("t21");
		//System.out.println(user);
		
		//setter��������ע��
		//User user = (User)ac.getBean("t22");
		//System.out.println(user);
	
		//�����ռ�c����ע��
		//User user = (User)ac.getBean("t23");
		//System.out.println(user);
		
		//�����ռ�p����ע��
		//User user = (User)ac.getBean("t24");
		//System.out.println(user);
		
		/**
		 * ����ͼ���ע��
		 */
		//User user = (User)ac.getBean("t31");
		//String[] goodFriends = user.getGoodFriends();
		//for (String string : goodFriends) {
		//	System.out.println(string);
		//}
		
		//User user = (User) ac.getBean("t32");
		//List boyFriends = user.getBoyFriends();
		//for (Object boyFriend : boyFriends) {
		//	System.out.println(boyFriend);
		//}
		
		
		//User user = (User) ac.getBean("t33");
		//Set girlFriends = user.getGirlFriends();
		//for (Object girlFriend : girlFriends) {
		//	System.out.println(girlFriend);
		//}
		
		//User user = (User) ac.getBean("t34");
		//Map singers = user.getSingers();
		//Iterator<String> it = singers.keySet().iterator();
		//while (it.hasNext()) {
		//	String key = it.next();
		//	String value = (String) singers.get(key);
		//	System.out.println(key + ":" + value);
		//}
		
		//User user = (User) ac.getBean("t35");
		//Properties properties = user.getProperties();
		//System.out.println(properties);
		
		
		
	}



}
