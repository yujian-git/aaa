package com.woniu.i_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	IUserDao ud;
	
	@Override
	public void save(User user) {
		ud.save(null);
		System.out.println(" UserServiceImpl.save()++++++");
	}
}
