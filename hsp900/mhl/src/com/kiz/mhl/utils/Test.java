package com.kiz.mhl.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        int i = Utility.readInt();
        System.out.println(i);
        Connection connection = JDBCUtilsByDruid.getConnection();
        System.out.println(connection);
    }
}
