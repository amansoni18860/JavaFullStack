package com.example.hibernate.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.hibernate.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Employee save(Employee employee) {

        if (employee.getId() == null) {
            entityManager.persist(employee);
            return employee;
        }

        return entityManager.merge(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {

        return entityManager
                .createQuery("FROM Employee", Employee.class)
                .getResultList();
    }

    @Override
    public Employee getEmployeeById(Long id) {

        return entityManager.find(Employee.class, id);
    }

    @Override
    public void deleteEmployee(Long id) {

        Employee employee =
                entityManager.find(Employee.class, id);

        if (employee != null) {
            entityManager.remove(employee);
        }
    }

    @Override
    public List<Employee> findByNameLike(String name) {

        return entityManager
                .createQuery(
                        "FROM Employee e WHERE e.name LIKE :name",
                        Employee.class)
                .setParameter("name", "%" + name + "%")
                .getResultList();
    }

    @Override
    public List<Employee> findByDepartmentAndSalary(
            String department,
            Double salary) {

        return entityManager
                .createQuery(
                        "FROM Employee e WHERE e.department = :department AND e.salary = :salary",
                        Employee.class)
                .setParameter("department", department)
                .setParameter("salary", salary)
                .getResultList();
    }

    @Override
    public List<Employee> findByDepartmentOrSalary(
            String department,
            Double salary) {

        return entityManager
                .createQuery(
                        "FROM Employee e WHERE e.department = :department OR e.salary = :salary",
                        Employee.class)
                .setParameter("department", department)
                .setParameter("salary", salary)
                .getResultList();
    }

    @Override
    public List<Employee> salaryGreaterThan(Double salary) {

        return entityManager
                .createQuery(
                        "FROM Employee e WHERE e.salary > :salary",
                        Employee.class)
                .setParameter("salary", salary)
                .getResultList();
    }

    @Override
    public List<Employee> salaryBetween(
            Double min,
            Double max) {

        return entityManager
                .createQuery(
                        "FROM Employee e WHERE e.salary BETWEEN :min AND :max",
                        Employee.class)
                .setParameter("min", min)
                .setParameter("max", max)
                .getResultList();
    }

    @Override
    public List<Employee> orderByName() {

        return entityManager
                .createQuery(
                        "FROM Employee e ORDER BY e.name ASC",
                        Employee.class)
                .getResultList();
    }
}