DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS members;

CREATE TABLE members (
    user_id VARCHAR(50) NOT NULL PRIMARY KEY,
    pass VARCHAR(500) NOT NULL,
    enabled BOOLEAN NOT NULL
);

CREATE TABLE roles (
    user_id VARCHAR(50) NOT NULL,
    role VARCHAR(50) NOT NULL,
    CONSTRAINT fk_authorities_users
        FOREIGN KEY (user_id)
        REFERENCES members(user_id)
);

CREATE UNIQUE INDEX ix_auth_username
ON roles (user_id, role);



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