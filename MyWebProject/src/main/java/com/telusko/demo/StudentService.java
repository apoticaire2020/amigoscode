package com.telusko.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public Collection<Student> getStudent() {
//		Collection<Student> cl = new ArrayList<Student>();
//		cl.add(new Student(1L, "ali", "said@yahoo", LocalDate.of(2022, 7, 22), 25));
//		cl.add(new Student(2L, "omar", "omar@yahoo", LocalDate.of(2022, 8,21),24));
//		return cl;
		
		return repository.findAll();
		
	}
	public void addNewStudent(Student student) {
		System.out.println(student);
	  //  repository.save(student);	
	}

}
