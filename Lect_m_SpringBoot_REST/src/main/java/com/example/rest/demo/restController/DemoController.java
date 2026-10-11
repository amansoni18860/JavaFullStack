package com.example.rest.demo.restController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.demo.entity.Student;
import com.example.rest.demo.exception.StudentErrorResponse;
import com.example.rest.demo.exception.StudentNotFoundException;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class DemoController {

	private List<Student>theStudents;
	
	@PostConstruct
	public void loadData() {
		theStudents = new ArrayList<>();

		theStudents.add(new Student("Raj", "Singh"));
		theStudents.add(new Student("Priya", "Sharma"));
		theStudents.add(new Student("Arjun", "Patel"));
		theStudents.add(new Student("Neha", "Gupta"));
		theStudents.add(new Student("Rahul", "Verma"));
		theStudents.add(new Student("Ananya", "Mehta"));
		theStudents.add(new Student("Vikram", "Reddy"));
		theStudents.add(new Student("Sneha", "Iyer"));
		theStudents.add(new Student("Karan", "Malhotra"));
		theStudents.add(new Student("Pooja", "Nair"));
		
	}
	
	@GetMapping("/students")
	public List<Student>getStudents(){
		
		return theStudents;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		if(studentId>theStudents.size() || studentId<0) 
		throw new StudentNotFoundException("Student Id not Found - "+studentId);
		
		return theStudents.get(studentId);
	}
	
	

}
