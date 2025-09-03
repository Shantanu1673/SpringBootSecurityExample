package com.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{
	Student findByUsername(String username);
}
