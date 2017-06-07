package com.sophia.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sophia.usertest.vo.Student;

public class StudentUtil extends Student {
	//split boys and girls from the student json data
	public Map<String, List<Student>> getGirls(List<Student> list) {
		Map<String,List<Student>> student = new HashMap<String,List<Student>>();
		List<Student> girls = new ArrayList<Student>();
		List<Student> boys = new ArrayList<Student>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSex().equals("f") ){
				girls.add(list.get(i));
			} else {
				boys.add(list.get(i));
			}
		}
		student.put("girl", girls);
		student.put("boys", boys);
		return student;
	}

}
