package com.jdbc.myjdbc;

public class TestJDBC {
    public static void main(String[] args) {
        JdbcInterface jdbcInterface = new MysqlJdbcImpl();
        jdbcInterface.getConnection();
        jdbcInterface.crud();
        jdbcInterface.close();

        JdbcInterface jdbcInterface2 = new OracleJdbcImpl();
        jdbcInterface2.getConnection();
        jdbcInterface2.crud();
        jdbcInterface2.close();
    }
}
