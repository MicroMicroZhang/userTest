package com.sophia.usertest.vo;

public class Student {
	private int id;
	private String name;
	private String sex;
	private String score;
	public int getId() {
		return id;
	}
	//comments by Sophia 2017/06/06
	//id do not need change so cancel the set function
/*	public void setId(int id) {
		this.id = id;
	}*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
}
