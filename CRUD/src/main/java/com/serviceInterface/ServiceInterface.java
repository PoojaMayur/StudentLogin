package com.serviceInterface;

import java.util.List;

import com.model.Student;

public interface ServiceInterface {

	Student saveStudent(Student s);

	Student loginStudent(Student s);

	List<Student> getAllData();

	void deleteStudent(int id);
	

}
