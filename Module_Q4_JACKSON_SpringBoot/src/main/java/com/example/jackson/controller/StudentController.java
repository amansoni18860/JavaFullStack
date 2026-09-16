package com.example.jackson.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jackson.entity.Student;
import com.example.jackson.entity.StudentErrorResponse;
import com.example.jackson.exceptions.StudentNotFoundException;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentController {

    private List<Student> students;

    @PostConstruct
    public void populate() {

        students = new ArrayList<>();

        students.add(new Student("Raj", "Singh"));
        students.add(new Student("Amit", "Sharma"));
        students.add(new Student("Priya", "Verma"));
        students.add(new Student("Neha", "Gupta"));
        students.add(new Student("Rahul", "Kumar"));
        students.add(new Student("Sneha", "Patel"));
        students.add(new Student("Vikas", "Yadav"));
        students.add(new Student("Pooja", "Joshi"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getSpecificStudent(@PathVariable int studentId) {

        if (studentId < 0 || studentId >= students.size()) {
            throw new StudentNotFoundException(
                    "Student id not found - " + studentId);
        }

        return students.get(studentId);
    }

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<StudentErrorResponse> handleException(
            StudentNotFoundException exc) {

        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}