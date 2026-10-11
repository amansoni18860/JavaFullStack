package com.example.mapping.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.demo.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}