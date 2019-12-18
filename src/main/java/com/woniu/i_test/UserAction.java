package com.woniu.i_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserAction {
	@Autowired
	IUserService us;
	
	public void save() {
		us.save(null);
		System.out.println("UserAction.save()");
	}
}
