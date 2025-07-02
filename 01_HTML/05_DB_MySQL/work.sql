CREATE TABLE member(
	id VARCHAR(100) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL
);

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

INSERT INTO person VALUES ("로이", 10 , "경기도 용인시");
INSERT INTO person VALUES ("레오", 6 , "경기도 용인시");
INSERT INTO person VALUES ("마리", 12 , "서울 강동구");
INSERT INTO person VALUES ("봉구", 7 , "경기도 광주시");

SELECT * FROM person;

