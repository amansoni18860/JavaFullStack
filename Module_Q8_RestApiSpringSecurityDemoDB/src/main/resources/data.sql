INSERT INTO users VALUES
('john', '{bcrypt}$2a$12$kIZQEUsBJ2T8f.g6M9TSMuQy.nmKuiLplldp/fat0BhntJD8yuxAO', true),
('mary', '{bcrypt}$2a$12$Q3vfO0DZWc5uKBNanL3I7OwdKX.YiSV.IlB91RvLiMGnVJrW/5Jl6', true),
('susan', '{bcrypt}$2a$12$1W0AEj.uP/bcqyhIO/29c..0bO1tOewoBTgAdalbsUKVHs8sUE48.', true);

INSERT INTO authorities VALUES
('john', 'ROLE_Employee'),

('mary', 'ROLE_Employee'),
('mary', 'ROLE_Manager'),

('susan', 'ROLE_Employee'),
('susan', 'ROLE_Manager'),
('susan', 'ROLE_Admin');


--john@123
--mary@123
--susan@123



INSERT INTO employee (first_name, last_name, email) VALUES
('John', 'Doe', 'john.doe@gmail.com');

INSERT INTO employee (first_name, last_name, email) VALUES
('Mary', 'Smith', 'mary.smith@gmail.com');

INSERT INTO employee (first_name, last_name, email) VALUES
('Susan', 'Wilson', 'susan.wilson@gmail.com');

INSERT INTO employee (first_name, last_name, email) VALUES
('David', 'Brown', 'david.brown@gmail.com');

INSERT INTO employee (first_name, last_name, email) VALUES
('Raj', 'Kapoor', 'raj.k@gmail.com');