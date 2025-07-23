CREATE TABLE member(
	id VARCHAR(100) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL
);
DROP TABLE member;
select * from member;


CREATE TABLE bank(
	name VARCHAR(100),
    balance INT
);
INSERT INTO bank VALUES('지은', 100000);
INSERT INTO bank VALUES('지연', 0);

Select * from bank;

UPDATE bank SET balance = balance - 30000 WHERE name = '지은';
UPDATE bank SET balance = balance + 30000 WHERE name = '지연';

SELECT balance FROM bank WHERE name ='지은';



CREATE TABLE person(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    age INT,
    addr VARCHAR(200)
);
member
INSERT INTO person VALUES ("로이", 10 , "경기도 용인시");

SELECT * FROM person;


//----------------------------------------------

CREATE TABLE Book(
	book_no INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(50) NOT NULL,
    access_Age INT DEFAULT 0
);
SELECT * FROM Book;

CREATE TABLE member(
	id VARCHAR(100) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    pwd VARCHAR(200) NOT NULL,
    age INT NOT NULL
);

SELECT * FROM member;


CREATE TABLE Rent(
	rent_no INT PRIMARY KEY AUTO_INCREMENT,
    id VARCHAR(100),
    book_no INT,
    rent_date DATE DEFAULT (CURRENT_DATE)
);



ALTER TABLE Rent ADD 
FOREIGN KEY (id) REFERENCES member(id);

ALTER TABLE Rent ADD 
FOREIGN KEY (book_no) REFERENCES Book(book_no);


SELECT * FROM member;


CREATE TABLE board (
    no INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    content TEXT,
    url VARCHAR(100),
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);
