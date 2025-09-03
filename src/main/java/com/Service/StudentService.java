package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.Model.Student;
import com.Repositery.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository studentRepository;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	public Student register(Student student)
	{
		student.setPassword(encoder.encode(student.getPassword()));
		return studentRepository.save(student);
	}
}
