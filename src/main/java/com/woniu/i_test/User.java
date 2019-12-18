package com.woniu.i_test;

import org.springframework.stereotype.Component;

public class User {
	private String userName;

	public final String getUserName() {
		return userName;
	}

	public final void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + "]";
	}
	
	
	
}
