package com.woniu.i_test;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao{
	@Override
	public void save(User user) {
		System.out.println("UserDaoImpl.save()");
	}
}
