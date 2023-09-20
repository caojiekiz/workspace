package com.kiz.dao.impl;

import com.kiz.dao.ProvinceDao;
import com.kiz.domain.Province;
import com.kiz.util.JDBCDruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProvinceDaoImpl implements ProvinceDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCDruidUtils.getDataSource());
    @Override
    public List<Province> findAll() {
        String sql = "select * from province";
        List<Province> list = template.query(sql,new BeanPropertyRowMapper<>(Province.class));
        return list;
    }
}
