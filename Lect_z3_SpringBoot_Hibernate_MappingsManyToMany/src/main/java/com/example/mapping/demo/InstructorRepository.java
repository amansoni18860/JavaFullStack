package com.example.mapping.demo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.demo.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}