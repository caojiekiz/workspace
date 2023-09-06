CREATE TABLE tab_category ( cid INT PRIMARY KEY auto_increment, cname VARCHAR ( 100 ) NOT NULL UNIQUE ) CREATE TABLE tab_route (
	rid INT PRIMARY KEY auto_increment,
	rname VARCHAR ( 100 ) NOT NULL UNIQUE,
	price DOUBLE,
	rdate DATE,
	cid INT,
	FOREIGN KEY ( cid ) REFERENCES tab_category ( cid ) 
);
CREATE TABLE tab_user (
	uid INT PRIMARY KEY auto_increment,
	username VARCHAR ( 100 ) UNIQUE NOT NULL,
	PASSWORD VARCHAR ( 30 ) NOT NULL,
	NAME VARCHAR ( 100 ),
	birthday date,
	sex CHAR ( 1 ) DEFAULT '男',
	telephone VARCHAR ( 11 ),
	email VARCHAR ( 100 ) 
);
CREATE TABLE tab_favorite (
	rid INT,
	date datetime,
	uid INT,
	PRIMARY KEY ( rid, uid ),
	FOREIGN KEY ( rid ) REFERENCES tab_route ( rid ),
FOREIGN KEY ( uid ) REFERENCES tab_user ( uid ) 
);