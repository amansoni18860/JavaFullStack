package com.example.mapping.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.mapping.demo.dao.AppDAO;
import com.example.mapping.demo.entity.Course;
import com.example.mapping.demo.entity.Instructor;

@SpringBootApplication
public class LectZSpringBootHibernateMappingsApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                LectZSpringBootHibernateMappingsApplication.class,
                args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {

        return runner -> {

            createInstructorWithCourses(appDAO);

            findInstructorWithCourses(appDAO);

            findCourse(appDAO);

            // deleteCourse(appDAO);

            // deleteInstructor(appDAO);
        };
    }

    private void createInstructorWithCourses(AppDAO appDAO) {

        Instructor instructor =
                new Instructor(
                        "John",
                        "Doe",
                        "john@gmail.com");

        Course course1 =
                new Course("Java");

        Course course2 =
                new Course("Spring Boot");

        Course course3 =
                new Course("Hibernate");

        instructor.addCourse(course1);
        instructor.addCourse(course2);
        instructor.addCourse(course3);

        appDAO.save(instructor);

        System.out.println("Saved Successfully");
    }

    private void findInstructorWithCourses(AppDAO appDAO) {

        int id = 1;

        Instructor instructor =
                appDAO.findInstructorByIdJoinFetch(id);

        System.out.println(instructor);

        for (Course course : instructor.getCourses()) {

            System.out.println(course);
        }
    }

    private void findCourse(AppDAO appDAO) {

        int id = 1;

        Course course =
                appDAO.findCourseById(id);

        System.out.println(course);

        System.out.println(
                "Instructor : "
                        + course.getInstructor());
    }

    private void deleteCourse(AppDAO appDAO) {

        int id = 1;

        appDAO.deleteCourseById(id);

        System.out.println("Course Deleted");
    }

    private void deleteInstructor(AppDAO appDAO) {

        int id = 1;

        appDAO.deleteInstructorById(id);

        System.out.println("Instructor Deleted");
    }
}