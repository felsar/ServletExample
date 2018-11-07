package com.felipesarabia.development.training.model;

import java.util.Date;

public class Person {

	private Integer id;
	private String name;
	private String lastName;
	private String email;
	private Date birthDate;
	
	public Person() {}
	
	public Person(Integer id, String name, String lastName, String email, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	public Person(String name, String lastName, String email, Date birthDate) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
}
