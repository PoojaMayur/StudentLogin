package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoInterface.DaoInterface;
import com.model.Student;
import com.serviceInterface.ServiceInterface;
@Service
public class ServiceImpl implements ServiceInterface {
@Autowired
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
	@Override
	public void deleteStudent(int id) {
		dao.delete(id);
		
	}

}
