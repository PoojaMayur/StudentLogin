package com.serviceInterface;

import java.util.List;

import com.model.Student;

public interface ServiceInterface {

	public Student saveStudent(Student s);

	public Student loginStudent(Student s);

	public List<Student> getAllData();

	void deleteStudent(int id);

	public Student editStudent(int id);
	

}
