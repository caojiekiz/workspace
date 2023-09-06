CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT,
    sex CHAR,
    birthday DATE,
    math FLOAT,
    English FLOAT,
    email VARCHAR(100)
);
select * FROM students;
drop table students;

-- 插入学生记录
-- 插入学生记录，name为中文名字
INSERT INTO students (name, age, sex, birthday, math, English, email)
VALUES 
    ('王小明', 20, '男', '2003-08-15', 85.5, 92.0, 'xiaoming@example.com'),
    ('李丽', 19, '女', '2002-05-20', 78.0, 88.5, 'lili@example.com'),
    ('张伟', 21, '男', '2001-11-30', 90.0, 85.0, 'zhangwei@example.com'),
    ('陈小红', 22, '女', '2000-07-05', 76.5, 89.5, 'xiaohong@example.com'),
    ('刘东', 23, '男', '1999-09-14', 88.0, 86.5, 'liudong@example.com'),
    ('赵梅', 20, '女', '2003-03-25', 92.5, 91.0, 'zhaomei@example.com'),
    ('黄建国', 18, '男', '2004-12-02', 75.0, 84.0, 'huangjianguo@example.com'),
    ('吴美丽', 24, '女', '1998-01-18', 87.5, 90.5, 'wumeili@example.com'),
    ('许明', 19, '女', '2005-07-08', 81.0, 88.0, 'xuming@example.com'),
    ('朱华', 22, '男', '2000-04-12', 89.5, 87.0, 'zhuhua@example.com');
-- ----------
SELECT sex,avg(math),count(id) FROM students WHERE math > 70 GROUP BY sex HAVING COUNT(id)>2;
-- 每页显示的记录
SELECT * FROM students LIMIT 3,3;