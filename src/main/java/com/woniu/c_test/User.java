package com.woniu.c_test;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
	private String user_name;
	private String user_role;
	private Level level;
	private String[] goodFriends;
	private List boyFriends;
	private Set girlFriends;
	private Map singers;
	private Properties properties;

	public final Properties getProperties() {
		return properties;
	}

	public final void setProperties(Properties properties) {
		this.properties = properties;
	}

	public final Map getSingers() {
		return singers;
	}

	public final void setSingers(Map singers) {
		this.singers = singers;
	}

	public final Set getGirlFriends() {
		return girlFriends;
	}

	public final void setGirlFriends(Set girlFriends) {
		this.girlFriends = girlFriends;
	}

	public final String[] getGoodFriends() {
		return goodFriends;
	}

	public final void setGoodFriends(String[] goodFriends) {
		this.goodFriends = goodFriends;
	}

	public final List getBoyFriends() {
		return boyFriends;
	}

	public final void setBoyFriends(List boyFriends) {
		this.boyFriends = boyFriends;
	}

	public User() {
		super();
	}

	public User(String user_name) {
		super();
		System.out.println("User的一个有参构造器");
		this.user_name = user_name;
	}

	public User(String user_name, String user_role) {
		super();
		System.out.println("User的两个有参构造器");
		this.user_name = user_name;
		this.user_role = user_role;
	}

	public User(String user_name, String user_role, Level level) {
		super();
		System.out.println("User的三个有参构造器");
		this.user_name = user_name;
		this.user_role = user_role;
		this.level = level;
	}

	public final String getUser_name() {
		return user_name;
	}

	public final void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public final String getUser_role() {
		return user_role;
	}

	public final void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	public final Level getLevel() {
		return level;
	}

	public final void setLevel(Level level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "User [user_name=" + user_name + ", user_role=" + user_role + ", level=" + level + "]";
	}

}
