DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    department VARCHAR(50),
    job_title VARCHAR(100),
    salary DECIMAL(10,2),
    hire_date DATE,
    phone VARCHAR(20),
    city VARCHAR(50)
);