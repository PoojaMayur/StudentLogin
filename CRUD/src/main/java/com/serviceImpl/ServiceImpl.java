package com.serviceImpl;

import java.util.List;

import com.daoInterface.DaoInterface;
import com.model.Student;
import com.serviceInterface.ServiceInterface;

public class ServiceImpl implements ServiceInterface {

	DaoInterface dao;
	@Override
	public Student saveStudent(Student s) {
	
		return dao.save(s);
	}
	@Override
	public Student loginStudent(Student s) {

		Student s1=dao.findAllByUsernameAndPassword(s.getUsername(), s.getPassword());
		return s1;
	}
	@Override
	public List<Student> getAllData() {
		List<Student>li=(List<Student>) dao.findAll();
		return li;
	}

}
