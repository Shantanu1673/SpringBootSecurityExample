package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Student;
import com.Service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/register")
	public Student register(@RequestBody Student student)
	{
		return studentService.register(student);
	}
}
