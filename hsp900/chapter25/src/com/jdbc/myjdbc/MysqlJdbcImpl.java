package com.jdbc.myjdbc;

public class MysqlJdbcImpl implements JdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("得到Mysql数据库连接");
        return null;

    }

    @Override
    public void crud() {
        System.out.println("完成Mysql的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭Mysql的连接");
    }
}
