package com.Model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import jakarta.persistence.Entity;

@Data
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student 
{
	@Id
	private int id;
	private String username;
	private String password;
}

