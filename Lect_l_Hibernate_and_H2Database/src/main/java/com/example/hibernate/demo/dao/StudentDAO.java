package com.example.hibernate.demo.dao;

import java.util.List;

import com.example.hibernate.demo.Student;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

    void update(Student student);

    void delete(Integer id);

    int deleteAll();
}