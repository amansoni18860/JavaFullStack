package com.example.mapping.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.mapping.demo.dao.AppDAO;
import com.example.mapping.demo.entity.Instructor;
import com.example.mapping.demo.entity.IntructorDetails;

@SpringBootApplication
public class LectZSpringBootHibernateMappingsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LectZSpringBootHibernateMappingsApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {

        return runner -> {
            createInstructor(appDAO);

            findInstructor(appDAO);
            
            deleteInstructor(appDAO);
        };
    }

    private void deleteInstructor(AppDAO appDAO) {
    
    	int theId=1;
    	
    	System.out.println("\n\nDeleting instructor id : "+theId);
    	
    	appDAO.deleteInstructorById(theId);
    	
    	System.out.println("\n\nDone...!");
    	
	}

	private void findInstructor(AppDAO appDAO) {

        int theId = 1;

        System.out.println("Finding instructor id : " + theId);

        Instructor tempInstructor = appDAO.findInstructorById(theId);

        System.out.println("\n\ntempInstructor : " + tempInstructor);
        System.out.println("\n\nThe associated InstructorDetail only : "
                + tempInstructor.getInstructorDetail());
    }

    private void createInstructor(AppDAO appDAO) {

        Instructor tempInstructor =
                new Instructor("Raj", "Singh", "db@gmail.com");

        IntructorDetails tempInstructorDetails =
                new IntructorDetails(
                        "http://www.google.com",
                        "Google Website");

        tempInstructor.setInstructorDetail(tempInstructorDetails);

        System.out.println("\n\nSaving instructor : " + tempInstructor);

        appDAO.save(tempInstructor);

        System.out.println("\n\nDone!");
    }
}