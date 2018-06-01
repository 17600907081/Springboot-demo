package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Student;


public interface StudentService {

	public List<Student> getAllStudent();
	
	int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
	
}
