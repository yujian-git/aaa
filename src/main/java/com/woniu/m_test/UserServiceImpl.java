package com.woniu.m_test;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
	public void save() {
		System.out.println("UserServiceImpl.save()");
		//System.out.println(1/0);
	}
	
	public void save(int i) {
		System.out.println("UserServiceImpl.save()" + i);
	}
}
