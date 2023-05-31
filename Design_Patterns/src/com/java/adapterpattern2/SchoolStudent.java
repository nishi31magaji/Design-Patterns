package com.java.adapterpattern2;

public class SchoolStudent {
	private String name;
	private String surname;
	private String email;
	
	
	public SchoolStudent(String name, String surname, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getEmail() {
		return email;
	}

}
