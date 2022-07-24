package com.telusko.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		List<Student> st = new ArrayList<Student>();
		return args->{
		  Student ali=	new Student(1L, "ali", "said@yahoo", LocalDate.of(2022, 7, 22));
		Student aicha=	new Student(2L, "aicha", "aicha@yahoo", LocalDate.of(1969, 7, 22));
		repository.save(ali);
		repository.save(aicha);
		
		};
		
	}
}
