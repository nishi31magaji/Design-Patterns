package com.java.adapterpattern2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentClient {
public static void main(String[] args) {
	List<Student>studentsList = new ArrayList<Student>();
	studentsList = getStudents();
	for(Student student:studentsList) {
		System.out.println(student.getName());

	}
	//Arrays.asList(studentsList);
}

public static List<Student>getStudents(){
	List<Student> studentList = new ArrayList<Student>();
	CollegeStudent collegeStudent = new CollegeStudent("nishi", "m", "n@gmail.com");
	studentList.add(collegeStudent);
	SchoolStudent schoolStudent = new SchoolStudent("rishi", "d", "r@gmail.com");
	SchoolStudentAdapter schoolstudadapter = new SchoolStudentAdapter(schoolStudent);
	studentList.add(schoolstudadapter);
	//what if we have a legacy class which is of schoolstudents
	//and we want to add that here in the list but it does not implement Student interface.
	//as its legacy code we cannot modify that one.
	//solution is to create an adapter class which implements Student interface
	return studentList;
}
}
