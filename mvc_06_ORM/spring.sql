CREATE SCHEMA `digital_spring` ;

USE digital_spring;
CREATE TABLE tbl_member(
	uno int primary key auto_increment,
    userid VARCHAR(50) NOT NULL UNIQUE,
    userpw VARCHAR(200) NOT NULL,
    username VARCHAR(30) NOT NULL,
    regdate TIMESTAMP DEFAULT now(),
    updatedate TIMESTAMP DEFAULT now()
);