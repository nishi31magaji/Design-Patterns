package com.java.adapterpattern2;

public class SchoolStudentAdapter implements Student {
    private SchoolStudent schoolStudent;
    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
    	this.schoolStudent=schoolStudent;
    }
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.schoolStudent.getName();
	}

	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return schoolStudent.getSurname();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return schoolStudent.getEmail();
	}

}
