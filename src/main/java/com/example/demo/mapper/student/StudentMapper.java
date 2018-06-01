package com.example.demo.mapper.student;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentMapper {
    List<Student> getAllStudent();
    
	int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}