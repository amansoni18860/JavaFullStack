package com.example.mapping.demo.dao;

import com.example.mapping.demo.entity.Instructor;
import com.example.mapping.demo.entity.IntructorDetails;

public interface AppDAO {

	void save(Instructor theInstructor);
	
	public Instructor findInstructorById(int theId);
	
	public void deleteInstructorById(int theId);
	
	IntructorDetails findInstructorDetailsById(int theId);
	
	void deleteInstructorDetailsById(int theId);
}
