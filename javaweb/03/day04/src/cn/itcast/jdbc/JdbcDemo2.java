package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
    public static void main(String[] args){
        //1.导入驱动
        //导入jar包,右键as a lib
        Connection conn = null;
        Statement stmt = null;
        int count = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","");
            String sql = "insert into account values (null,'Checking Account 1', 25000.75, 'Checking', '2012-02-20')";
            stmt = conn.createStatement();
            count = stmt.executeUpdate(sql);
            System.out.println(count);
            if(count > 0) {
                System.out.println("添加成功!");
            }else{
                System.out.println("添加失败!");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}
