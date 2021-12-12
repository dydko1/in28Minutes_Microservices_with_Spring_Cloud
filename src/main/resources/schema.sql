CREATE TABLE users(
    id INT NOT NULL AUTO_INCREMENT,
    email VARCHAR(255),
    user_password VARCHAR(255),
    birth_date DATE,
    favorite_number INT,
    PRIMARY KEY (id)
);

CREATE TABLE country1 (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);

create table user (id integer not null, birth_date timestamp, name varchar(255), primary key (id));