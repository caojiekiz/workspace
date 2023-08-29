package com.jdbc.utils;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class JDBCUtils_Use {
    public static void main(String[] args) {

    }


    @Test
    public void testDML() {
        //1.得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql = "update actor set name = ? where id = ?";
        //3.创建PreparedStatement
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"王天天");
            preparedStatement.setInt(2,4);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }
}
