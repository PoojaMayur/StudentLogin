package com.DaoInterface;

import org.springframework.data.repository.CrudRepository;

import com.model.Student;

public interface DaoInterface extends CrudRepository<Student, Integer>
{
public Student findAllByUnameAndPass(String uname,String pass);
}
