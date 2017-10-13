package com.wn.model;

import java.io.Serializable;

import com.wn.common.BaseEntity;

public class User extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private Integer age;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
