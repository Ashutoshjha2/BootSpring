package com.test.Students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.Students.dao.StudentDao;
import com.test.Students.entity.StudentsRecord;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDao studentdao;
	
	@RequestMapping("home")
	public String homepage() {
		System.out.println("WELCOME TO INDEX.HTML");
		StudentsRecord  record = new StudentsRecord(101, "VIVEK", "chitrakoot", "vivek@gmail.com");
		this.studentdao.save(record);
		System.out.println("DONE");
		 return "index";
		
	}

}
