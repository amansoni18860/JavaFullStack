-- USERS
INSERT INTO users (username, password, enabled)
VALUES
('john', '{noop}test1234', true),
('mary', '{noop}test1234', true),
('susan', '{noop}test1234', true);

-- AUTHORITIES
INSERT INTO authorities (username, authority)
VALUES
('john', 'ROLE_EMPLOYEE'),

('mary', 'ROLE_EMPLOYEE'),
('mary', 'ROLE_MANAGER'),

('susan', 'ROLE_EMPLOYEE'),
('susan', 'ROLE_MANAGER'),
('susan', 'ROLE_ADMIN');