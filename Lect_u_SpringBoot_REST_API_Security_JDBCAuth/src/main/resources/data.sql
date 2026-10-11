INSERT INTO users(username, password, enabled)
VALUES
('john', '{noop}test123', true),
('mary', '{noop}test123', true),
('susan', '{noop}test123', true);

INSERT INTO authorities(username, authority)
VALUES
('john', 'ROLE_EMPLOYEE'),
('mary', 'ROLE_EMPLOYEE'),
('mary', 'ROLE_MANAGER'),
('susan', 'ROLE_EMPLOYEE'),
('susan', 'ROLE_MANAGER'),
('susan', 'ROLE_ADMIN');


INSERT INTO employee
(first_name,last_name,email,department,job_title,salary,hire_date,phone,city)
VALUES
('Leslie','Andrews','leslie@company.com','IT','Software Engineer',75000,'2022-01-10','9876543210','Bangalore'),

('Emma','Baumgarten','emma@company.com','HR','HR Manager',68000,'2021-05-15','9876543211','Mumbai'),

('Avani','Gupta','avani@company.com','Finance','Financial Analyst',72000,'2020-03-12','9876543212','Delhi'),

('Yuri','Petrov','yuri@company.com','IT','DevOps Engineer',85000,'2023-02-28','9876543213','Pune'),

('Juan','Vega','juan@company.com','Sales','Sales Executive',60000,'2021-07-14','9876543214','Hyderabad'),

('Raj','Singh','raj@company.com','IT','Backend Developer',80000,'2022-04-21','9876543215','Bangalore'),

('Priya','Sharma','priya@company.com','IT','Frontend Developer',78000,'2022-08-19','9876543216','Bangalore'),

('Arjun','Patel','arjun@company.com','Finance','Accountant',65000,'2021-09-07','9876543217','Ahmedabad'),

('Neha','Verma','neha@company.com','HR','Recruiter',55000,'2023-01-11','9876543218','Delhi'),

('Vikram','Reddy','vikram@company.com','Sales','Sales Manager',95000,'2020-12-20','9876543219','Hyderabad'),

('Ananya','Rao','ananya@company.com','Marketing','Marketing Lead',88000,'2021-06-30','9876543220','Chennai'),

('Karan','Mehta','karan@company.com','IT','Full Stack Developer',90000,'2024-02-15','9876543221','Pune'),

('Sneha','Iyer','sneha@company.com','Operations','Operations Manager',85000,'2020-10-10','9876543222','Bangalore'),

('Rahul','Joshi','rahul@company.com','Support','Technical Support Engineer',50000,'2023-03-22','9876543223','Mumbai'),

('Meera','Kapoor','meera@company.com','Marketing','Content Strategist',62000,'2022-11-05','9876543224','Delhi');