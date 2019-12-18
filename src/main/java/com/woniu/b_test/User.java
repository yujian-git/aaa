package com.woniu.b_test;

public class User {
	private Integer user_Id;
	private String user_name;
	private String user_pwd;
	private String user_role;
	private String user_status;
	private String user_photo;
	private Integer level_id;
	public final Integer getUser_Id() {
		return user_Id;
	}
	public final void setUser_Id(Integer user_Id) {
		this.user_Id = user_Id;
	}
	public final String getUser_name() {
		return user_name;
	}
	public final void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public final String getUser_pwd() {
		return user_pwd;
	}
	public final void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public final String getUser_role() {
		return user_role;
	}
	public final void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	public final String getUser_status() {
		return user_status;
	}
	public final void setUser_status(String user_status) {
		this.user_status = user_status;
	}
	public final String getUser_photo() {
		return user_photo;
	}
	public final void setUser_photo(String user_photo) {
		this.user_photo = user_photo;
	}
	public final Integer getLevel_id() {
		return level_id;
	}
	public final void setLevel_id(Integer level_id) {
		this.level_id = level_id;
	}
	@Override
	public String toString() {
		return "User [user_Id=" + user_Id + ", user_name=" + user_name + ", user_pwd=" + user_pwd + ", user_role="
				+ user_role + ", user_status=" + user_status + ", user_photo=" + user_photo + ", level_id=" + level_id
				+ "]";
	}
	
	
}
