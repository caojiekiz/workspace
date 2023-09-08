package cn.itcast.jdbctemplate;

import cn.itcast.domain.Emp;
import cn.itcast.util.JDBCDruidUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo2 {
//    public static void main(String[] args) {
//        JdbcTemplate template = new JdbcTemplate(JDBCDruidUtils.getDataSource());
//        String sql = "update account set balance = 5000 where account_id = ?";
//        int count = template.update(sql,4);
//        System.out.println(count);
//    }
    JdbcTemplate template = new JdbcTemplate(JDBCDruidUtils.getDataSource());
    @Test
    public void test1(){

        String sql = "update emp set salary = 5000 where id = 1001";
        int count = template.update(sql);
        System.out.println(count);

    }
    @Test
    public void test2(){

        String sql = "insert into emp(id,ename,dept_id) values (?,?,?)";
        int count = template.update(sql,1016,"郭靖",10);
        System.out.println(count);

    }
    @Test
    public void test3(){

        String sql = "delete from emp where id = ?";
        int count = template.update(sql,1016);
        System.out.println(count);

    }
    @Test
    //map 方法查询的结果集长度只能为1,
    public void test4(){
        String sql = "select * from emp where id = ?";
        Map<String,Object> map = template.queryForMap(sql,1001);
        System.out.println(map);
    }
    @Test
    //查询所有记录,将其封装list
    public void test5(){
        String sql = "select * from emp";
        List<Map<String,Object>> list = template.queryForList(sql);
        for(Map<String,Object> stringObjectMap : list){
            System.out.println(stringObjectMap);
        }
    }
    @Test
    public void test6(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql,new BeanPropertyRowMapper<Emp>(Emp.class));
        for(Emp emp : list){
            System.out.println(emp);
        }
    }
    @Test
    public void test7(){
        String sql = "select count(*) from emp";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
