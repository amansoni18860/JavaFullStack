package com.example.hibernate.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.hibernate.demo.dao.StudentDAO;

@SpringBootApplication
public class LectLHibernateAndH2DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LectLHibernateAndH2DatabaseApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDao) {
		return runner -> {

			createStudent(studentDao);

			readStudent(studentDao);

			queryForStudents(studentDao);

			updateStudent(studentDao);

			deleteStudent(studentDao);

			deleteAllStudents(studentDao);
		};
	}

	private void createStudent(StudentDAO studentDao) {

		System.out.println("Creating student object");

		Student tempStudent = new Student("Raj", "Doe", "raj@gmail.com");

		System.out.println("Saving student");

		studentDao.save(tempStudent);

		System.out.println("Saved student id: " + tempStudent.getId());
	}

	private void readStudent(StudentDAO studentDao) {

		System.out.println("Reading student...");

		int studentId = 1;

		Student tempStudent = studentDao.findById(studentId);

		System.out.println("Found student = " + tempStudent);
	}

	private void queryForStudents(StudentDAO studentDao) {

		List<Student> students = studentDao.findAll();

		System.out.println("Students List");

		for (Student tempStudent : students) {
			System.out.println(tempStudent);
		}
	}

	private void updateStudent(StudentDAO studentDao) {

		int studentId = 1;

		System.out.println("Getting student with id: " + studentId);

		Student myStudent = studentDao.findById(studentId);

		System.out.println("Updating student...");

		myStudent.setFirstName("Rohit");

		studentDao.update(myStudent);

		System.out.println("Updated Student");

		System.out.println(myStudent);
	}

	
	private void deleteStudent(StudentDAO studentDao) {

		int studentId = 1;

		System.out.println("Deleting student id: " + studentId);

		studentDao.delete(studentId);
	}

	
	private void deleteAllStudents(StudentDAO studentDao) {

		System.out.println("Deleting all students");

		int numRowsDeleted = studentDao.deleteAll();

		System.out.println("Deleted rows count: " + numRowsDeleted);
		

	}
	

}
