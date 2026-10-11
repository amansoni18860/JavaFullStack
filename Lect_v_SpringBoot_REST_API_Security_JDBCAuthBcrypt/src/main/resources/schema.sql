DROP TABLE IF EXISTS authorities;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    username VARCHAR(50) NOT NULL PRIMARY KEY,
    password VARCHAR(500) NOT NULL,
    enabled BOOLEAN NOT NULL
);

CREATE TABLE authorities (
    username VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    CONSTRAINT fk_authorities_users
        FOREIGN KEY (username)
        REFERENCES users(username)
);

CREATE UNIQUE INDEX ix_auth_username
ON authorities (username, authority);



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