-- Note that this sql script is only for populating the local db machine.
CREATE
    DATABASE fish;
USE
    fish;

CREATE TABLE customer
(
    address  VARCHAR(255) NOT NULL,
    mail     VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL,
    name     VARCHAR(255) NOT NULL,
    surname  VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (username)
);
CREATE TABLE cooperativeHead
(
    mail     VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (username)
);
CREATE TABLE cooperativeMember
(
    mail     VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (username)
);
CREATE TABLE fisherman
(
    mail     VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    Iban     VARCHAR(255) NOT NULL,
    owner    VARCHAR(255) NOT NULL,
    PRIMARY KEY (username)
);
CREATE TABLE Code(
    member_code VARCHAR(255) NOT NULL,
    PRIMARY KEY (member_code)
);
CREATE TABLE Auction(
    date FLOAT,
    name VARCHAR(255),
    id VARCHAR(255),
    quota INT,
    PRIMARY KEY (id)
);
INSERT INTO Customer
VALUES ("Iyte Bilgisayar", "canrollas@gmail.com", "canrollas", "Can", "Rollas", "123can123");
INSERT INTO Customer
VALUES ("randomAddress", "random@gmail.com", "randomUser", "cagatay", "iba", "random_psw_123");
INSERT INTO cooperativeMember
VALUES ("member234@email.com", "Member_123", "random_psw_234");
INSERT INTO Customer
VALUES ("randomAddress", "random@gmail.com", "randomUser", "cagatay", "iba", "random_psw_123");
INSERT INTO fisherman
VALUES ("randomFm@gmail.com", "Ali_Kaptan", "random_psw_567", "11111111111111111111111111", "ali kuscu");
INSERT INTO cooperativeHead
VALUES ("admin@gmail.com", "Admin", "lorem_ipsum");
INSERT INTO Auction
VALUES(1,"test", "1", 100)