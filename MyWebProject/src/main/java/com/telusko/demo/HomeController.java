package com.telusko.demo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class HomeController {
	
//	@RequestMapping("/home")
//	@ResponseBody
//	public String home() {
//		
//		System.out.println("salam");
//		return "home.jsp";
//	}
	
	@Autowired
	private StudentService service;
   
	@GetMapping
	public Collection<Student> getAll(){
		return service.getStudent();
	}
	@PostMapping
	public void registerNewStudent(@RequestBody Student student) {
		service.addNewStudent(student);
	}

}
