package cn.itcast.jdbc;

import cn.itcast.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

import static cn.itcast.util.JDBCUtils.*;

public class JdbcPractice {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名: ");
        String username = sc.nextLine();
        System.out.println("请输入密码: ");
        String password = sc.nextLine();
        boolean flag = new JdbcPractice().login(username, password);
        if(flag){
            System.out.println("登录成功!");
        }else{
            System.out.println("用户名或者密码错误!");
        }
    }
    public boolean login(String username,String password) throws SQLException {
        if(username == null || password == null) {
            return false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where username = ? and password = ?" ;
            ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            //stmt = conn.createStatement();
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(rs,ps,conn);
        }
//        return false;
    }
}
