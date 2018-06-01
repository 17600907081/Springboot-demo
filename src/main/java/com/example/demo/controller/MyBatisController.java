package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.student.StudentMapper;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

/**
 * 功能描述:   链接数据库的类       
 * @ClassName MyBatisController
 * @author    ThinkPad
 * @version   V-1.0
 * @Time      2018年5月30日  下午3:37:41
 */

@Controller		//@RestControlle如果加载控制层，则只能返回json不能反回试图viwe
@RequestMapping("/hello")
public class MyBatisController {
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/getAllStudent")
	@ResponseBody
	public Object getAllStudent() {
		return studentService.getAllStudent();
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public int insert() {
		Student student = new Student();
		student.setAge(18);
		student.setName("李思思");
		student.setSex("女");
		return studentService.insert(student);
	}
	
	@Autowired		//直接注入DAO层（或mapper层）就可以把service层给省了，但是相关业务就得写在controller层
	private StudentMapper studentMapper;
	
	@RequestMapping("/selectByPrimaryKey")
	@ResponseBody
	public Object selectByPrimaryKey() {
		//直接注入DAO层（或mapper层）就可以把service层给省了，但是相关业务就得写在controller层
		return studentMapper.selectByPrimaryKey(7);
	}
	
	
}
