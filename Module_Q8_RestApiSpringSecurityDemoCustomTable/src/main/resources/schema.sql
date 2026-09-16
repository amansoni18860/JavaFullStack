CREATE TABLE members (
    username VARCHAR(50) NOT NULL PRIMARY KEY,
    pass VARCHAR(68) NOT NULL,
    active BOOLEAN NOT NULL
);

CREATE TABLE auth (
    username VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    CONSTRAINT fk_authorities_users
        FOREIGN KEY(username)
        REFERENCES members(username)
);

CREATE UNIQUE INDEX ix_auth_username
ON auth(username, authority);