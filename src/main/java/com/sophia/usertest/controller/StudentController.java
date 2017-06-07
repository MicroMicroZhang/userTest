package com.sophia.usertest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sophia.usertest.service.StudentService;
import com.sophia.usertest.vo.Student;
import com.sophia.util.StudentUtil;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;
	HttpServletRequest request;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/student",method = RequestMethod.GET)
	public String student(){
		
		return "students";
	}
	
	@RequestMapping(value = "/getstudents",method = RequestMethod.GET)
	public @ResponseBody Map<String,List<Student>> getStudent(){
		List<Student> student = new ArrayList<Student>();
		student = studentService.getStudents();
		Map<String,List<Student>> students = new HashMap<String,List<Student>>();
		List<Student> girls = new ArrayList<Student>();
		List<Student> boys = new ArrayList<Student>();
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getSex().equals("f") ){
				girls.add(student.get(i));
			} else {
				boys.add(student.get(i));
			}
		}
		students.put("girl", girls);
		students.put("boys", boys);
		return students;
	}
	
	@RequestMapping(value = "/getstudentsList",method = RequestMethod.GET)
	public @ResponseBody List<Student> getstudentsList(){
		List<Student> student = new ArrayList<Student>();
		student = studentService.getstudentsList();
		return student;
	}
	
}
