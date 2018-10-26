package com.serviceImpl;

import com.daoInterface.DaoInterface;
import com.model.Student;
import com.serviceInterface.ServiceInterface;

public class ServiceImpl implements ServiceInterface {

	DaoInterface dao;
	@Override
	public Student saveStudent(Student s) {
	
		return dao.save(s);
	}

}
