package com.java.adapterpattern2;

//new implementation
public class CollegeStudent implements Student {
	private String name;
	private String surname;
	private String email;

	public CollegeStudent(String name, String surname, String email) {
		this.name = name;
		this.surname = surname;
		this.email = email;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return surname;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

}
