package com.jdbc.myjdbc;

public class OracleJdbcImpl implements JdbcInterface {

    @Override
    public Object getConnection() {
        System.out.println("得到Oracle数据库连接");
        return null;

    }

    @Override
    public void crud() {
        System.out.println("完成Oracle的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracle的连接");
    }
}
