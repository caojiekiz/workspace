package cn.itcast.jdbctemplate;

import cn.itcast.util.JDBCDruidUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCDruidUtils.getDataSource());
        String sql = "update account set balance = 5000 where account_id = ?";
        int count = template.update(sql,4);
        System.out.println(count);
    }
}
