-- CREATE DATABASE db3;
use db3;
CREATE TABLE account (
    account_id INT AUTO_INCREMENT PRIMARY KEY,
    account_name VARCHAR(100) NOT NULL,
    balance DECIMAL(10, 2) NOT NULL,
    account_type ENUM('Savings', 'Checking', 'Credit') NOT NULL,
    open_date DATE NOT NULL
);
SELECT * FROM account ;

-- 插入账户记录
INSERT INTO account (account_name, balance, account_type, open_date)
VALUES 
    ('Savings Account 1', 5000.50, 'Savings', '2022-01-15'),
    ('Checking Account 1', 2500.75, 'Checking', '2022-02-20'),
    ('Credit Card 1', -1000.25, 'Credit', '2022-03-10'),
    ('Savings Account 2', 8000.00, 'Savings', '2022-04-05'),
    ('Checking Account 2', 3000.20, 'Checking', '2022-05-15'),
    ('Credit Card 2', -500.75, 'Credit', '2022-06-25'),
    ('Savings Account 3', 7500.60, 'Savings', '2022-07-30'),
    ('Checking Account 3', 4000.90, 'Checking', '2022-08-10'),
    ('Credit Card 3', -800.45, 'Credit', '2022-09-20'),
    ('Savings Account 4', 10000.25, 'Savings', '2022-10-05');
-- user 
CREATE TABLE USER(
	id int PRIMARY key auto_increment,
	username varchar(32),
	PASSWORD VARCHAR(32)
	);
INSERT into user VALUES(null,'zhangsan','123');
INSERT into user VALUES(null,'lisi','123456');