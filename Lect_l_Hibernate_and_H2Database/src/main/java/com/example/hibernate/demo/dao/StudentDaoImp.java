package com.example.hibernate.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.hibernate.demo.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDaoImp implements StudentDAO{
	
	private EntityManager entityManager;

	@Autowired
	public StudentDaoImp(EntityManager theManager) {
		this.entityManager=theManager;
	}
	
	
	@Override
	@Transactional
	public void save(Student theStudent) {
		entityManager.persist(theStudent);
	}
	
	@Override
	public Student findById(Integer id) {
	    return entityManager.find(Student.class, id);
	}
	
	@Override
	public List<Student> findAll() {

	    TypedQuery<Student> theQuery =
	            entityManager.createQuery(
	                    "FROM Student",
	                    Student.class);

	    return theQuery.getResultList();
	}
	
	
	@Override
	@Transactional
	public void update(Student student) {
	    entityManager.merge(student);
	}
	
	
	@Override
	@Transactional
	public void delete(Integer id) {

	    Student tempStudent =
	            entityManager.find(Student.class, id);

	    entityManager.remove(tempStudent);
	}
	
	
	@Override
	@Transactional
	public int deleteAll() {

	    int deletedCount =
	        entityManager.createQuery(
	            "DELETE FROM Student")
	            .executeUpdate();

	    return deletedCount;
	}
}
