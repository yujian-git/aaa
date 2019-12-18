package com.woniu.f_test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class User implements BeanNameAware,BeanFactoryAware,ApplicationContextAware{
	private int uid;
	private String uname;
	
	public void abc() {
		System.out.println("ִ����User��abc����");
	}
	
	public void def() {
		System.out.println("ִ����User��def����");
	}
	
	
	
	public User() {
		System.out.println("�޲ι�����");
	}

	public User(int uid, String uname) {
		this.uid = uid;
		this.uname = uname;
		System.out.println("�вι�����");
	}
	
	
	public final int getUid() {
		return uid;
	}

	public final void setUid(int uid) {
		System.out.println("setUid(int uid)");
		this.uid = uid;
	}

	public final String getUname() {
		return uname;
	}

	public final void setUname(String uname) {
		System.out.println("setUname(String uname)");
		this.uname = uname;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + "]";
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("ִ����setBeanName����"+name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("ִ����setBeanFactory����" + beanFactory);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("ִ����setApplicationContext����" + applicationContext);
	}
	
	


	
}
