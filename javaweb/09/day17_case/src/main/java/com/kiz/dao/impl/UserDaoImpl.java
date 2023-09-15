package com.kiz.dao.impl;

import com.kiz.dao.UserDao;
import com.kiz.domain.User;

import java.util.List;

import com.kiz.util.JDBCDruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
public class UserDaoImpl implements UserDao {
    private JdbcTemplate template =  new JdbcTemplate(JDBCDruidUtils.getDataSource());
    @Override
    public List<User> findAll() {
        //使用JDBC完成查询
        String sql = "select * from user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }
    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        try {
            String sql = "select * from user where username = ? and password = ?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username, password);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public void add(User user) {
        String sql = "insert into user values(null,?,?,?,?,?,?,null,null)";
        template.update(sql,user.getName(),user.getGender(),user.getAge(),user.getAddress(),
                        user.getLine(),user.getEmail());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from user where id = ?";
        template.update(sql,id);
    }

    @Override
    public User findById(int id) {
        String sql = "select * from user where id = ?";
        return template.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),id);
    }

    @Override
    public void update(User user) {
        String sql = "update user set name = ?,gender = ?,age = ?,address = ?,line = ?,email = ? where id = ?";
        template.update(sql,user.getName(),user.getGender(),user.getAge(),user.getAddress(),
                user.getLine(),user.getEmail(),user.getId());
    }
}
