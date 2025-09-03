package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Model.Student;
import com.Model.StudentPrinciple;
import com.Repositery.StudentRepository;

@Service
public class CustomUserDetailService implements UserDetailsService
{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		Student student = studentRepository.findByUsername(username);
		
		if (student == null)
		{
			System.out.println("User Not Found....");
			throw new UsernameNotFoundException("User Not Found....");
		}
		return new StudentPrinciple(student);
	}
	
	
}
