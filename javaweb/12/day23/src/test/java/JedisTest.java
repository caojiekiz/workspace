import com.kiz.util.JedisPoolUtils;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JedisTest {
    /**
     *
     */
    @Test
    public void test1(){
        Jedis jedis = new Jedis("localhost",6379);
        jedis.set("username","zhangsan");
        jedis.close();
    }
    /**
     *string 数据结构操作
     */
    @Test
    public void test2(){
        //1.获取连接
        //Jedis jedis = new Jedis("localhost",6379);
        Jedis jedis = new Jedis();
        jedis.set("username","zhangsan");
        String username = jedis.get("username");
        System.out.println(username);
        //用setex方法存储可以指定过期时间
        jedis.setex("activecode",20,"hehe");
        //3.关闭连接
        jedis.close();
    }
    /**
     * hash 数据结构操作
     */
    @Test
    public void test3(){
        //1.获取连接
        //Jedis jedis = new Jedis("localhost",6379);
        Jedis jedis = new Jedis();
        jedis.hset("user","name","lisi");
        jedis.hset("user","age","23");
        jedis.hset("user","gender","male");
        String name = jedis.hget("user", "name");
        System.out.println(name);
        //获取hash的所有map中的数据
        Map<String, String> user = jedis.hgetAll("user");
        Set<String> keySet = user.keySet();
        for (String key : keySet) {
            String value = user.get(key);
            System.out.println(key + ":" + value);
        }
        //3.关闭连接
        jedis.close();
    }

    /**
     * list 数据结构操作
     */
    @Test
    public void test4(){
        Jedis jedis = new Jedis();
        //list存储
        jedis.lpush("mylist","a","b","c","d");
        jedis.rpush("mylist","a","b","c","d");
        //list 范围获取
        List<String> mylist = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist);
        //list弹出
        String element1 = jedis.lpop("mylist");
        System.out.println(element1);
        String element2 = jedis.rpop("mylist");
        System.out.println(element2);
        List<String> mylist2 = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist2);
        //3.关闭连接
        jedis.close();
    }
    /**
     * set 数据结构操作
     */
    @Test
    public void test5(){
        Jedis jedis = new Jedis();
        //2.操作
        jedis.sadd("myset","java","php","c++");
        Set<String> myset = jedis.smembers("myset");
        System.out.println(myset);
        //3.关闭连接
        jedis.close();
    }
    /**
     * sortedset 数据结构操作
     */
    @Test
    public void test6(){
        Jedis jedis = new Jedis();
        //2.操作
        jedis.zadd("mysortedset",3,"亚瑟");
        jedis.zadd("mysortedset",30,"后羿");
        jedis.zadd("mysortedset",55,"孙悟空");
        List<String> mysortedset = jedis.zrange("mysortedset", 0, -1);
        System.out.println(mysortedset);

        //3.关闭连接
        jedis.close();
    }
    /**
     * jedis连接池使用
     */
    @Test
    public void test7(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(10);
        JedisPool jedisPool = new JedisPool(config,"localhost",6379);
        Jedis jedis = jedisPool.getResource();
        jedis.set("hehe","hhhh");

        //
        jedis.close();
    }
    /**
     * jedis连接池工具使用
     */
    @Test
    public void test8(){
        Jedis jedis = JedisPoolUtils.getJedis();

        jedis.set("hello","world");

        //
        jedis.close();
    }
}
