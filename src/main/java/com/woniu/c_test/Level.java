package com.woniu.c_test;

public class Level {
	private Integer level_id;
	private String level_name;
	
	public Level() {
		super();
	}
	
	public Level(Integer level_id, String level_name) {
		super();
		this.level_id = level_id;
		this.level_name = level_name;
	}
	
	public Integer getLevel_id() {
		return level_id;
	}
	public  void setLevel_id(Integer level_id) {
		this.level_id = level_id;
	}
	public  String getLevel_name() {
		return level_name;
	}
	public  void setLevel_name(String level_name) {
		this.level_name = level_name;
	}

	@Override
	public String toString() {
		return "Level [level_id=" + level_id + ", level_name=" + level_name + "]";
	}
	
	
	
	
	
	
}
