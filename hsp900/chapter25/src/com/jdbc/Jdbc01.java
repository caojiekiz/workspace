package com.jdbc;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
        //1.注册驱动
        //Driver driver = new Driver();
        Driver driver = new Driver();
        //2.得到连接
        String url = "jdbc:mysql://localhost:3306/db01";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","12345678");
        Connection connect = driver.connect(url, properties);
        //3.执行sql
        //String sql = "insert into actor values(null,'刘德华','男','1970-11-11','110')";
        String sql = "update actor set name='周星驰' where id = 1";

        Statement statement = connect.createStatement();//
        int rows = statement.executeUpdate(sql);
        System.out.println(rows > 0 ? "成功":"失败");
        //4.关闭连接资源
        statement.close();
        connect.close();
    }
}
