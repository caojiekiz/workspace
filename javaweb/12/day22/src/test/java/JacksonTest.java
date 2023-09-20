import com.fasterxml.jackson.databind.ObjectMapper;
import com.kiz.domain.Person;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class JacksonTest {
   @Test
   public void test1() throws Exception{
       Person p = new Person();
       p.setName("zhangsan");
       p.setAge(22);
       p.setGender("男");
       //2.
       ObjectMapper mapper = new ObjectMapper();
       String json = mapper.writeValueAsString(p);
       //System.out.println(json);
       //mapper.writeValue(new File("/Users/dreamtank/a.txt"),p);
       mapper.writeValue(new FileWriter("/Users/dreamtank/b.txt"),p);
   }
   @Test
    public void test2() throws Exception{
       Person p = new Person();
       p.setName("zhangsan");
       p.setAge(22);
       p.setGender("男");
       p.setBirthday(new Date());
       ObjectMapper mapper = new ObjectMapper();
       String json = mapper.writeValueAsString(p);
       System.out.println(json);
    }
    @Test
    //list
    public void test3() throws Exception{
        Person p = new Person();
        p.setName("zhangsan");
        p.setAge(22);
        p.setGender("男");
        Person p1 = new Person();
        p.setName("zhangsan");
        p.setAge(22);
        p.setGender("男");
        Person p2 = new Person();
        p.setName("zhangsan");
        p.setAge(22);
        p.setGender("男");
        List<Person> ps = new ArrayList<>();
        ps.add(p);
        ps.add(p1);
        ps.add(p2);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(ps);
        System.out.println(json);
    }
    @Test
    //map
    public void test4() throws Exception{
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("age",23);
        map.put("gender","男");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);
        System.out.println(json);
    }
    @Test
    public void test5() throws Exception{
       String json = "{\"gender\":\"男\",\"name\":\"zhangsan\",\"age\":23}";
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);

    }
}
