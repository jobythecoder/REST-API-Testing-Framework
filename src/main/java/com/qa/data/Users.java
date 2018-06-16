package com.qa.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//pojo - plain old java object
public class Users {

	String name;
	String password;
	String id;
	String createdAt;
	
	

	public Users() {

	}

	public Users(String name, String password) {
		this.name = name;
		this.password = password;
	}

	
	//getters and setters methods:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	


}
