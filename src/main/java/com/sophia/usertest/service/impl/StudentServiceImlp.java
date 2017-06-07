package com.sophia.usertest.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophia.usertest.dao.StudentDao;
import com.sophia.usertest.service.StudentService;
import com.sophia.usertest.vo.Student;
@Service
public class StudentServiceImlp implements StudentService{
	@Autowired
	StudentDao studentDao;
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<Student>();
		students = studentDao.getStudents();
		return students;

	}
	@Override
	public List<Student> getstudentsList() {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		students = studentDao.getstudentsList();
		return students;
	}
}
