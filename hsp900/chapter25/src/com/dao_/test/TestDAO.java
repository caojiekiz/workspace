package com.dao_.test;

import com.dao_.dao.ActorDAO;
import com.dao_.domain.Actor;
import org.junit.jupiter.api.Test;

import java.util.List;


public class TestDAO {
    @Test
    public void testActorDAO() {
        ActorDAO actorDAO = new ActorDAO();
        List<Actor> actors = actorDAO.queryMulti("select * from actor where id >= ?",Actor.class,1);
        System.out.println("===查询结果===");
        for (Actor actor : actors) {
            System.out.println(actor);
        }
        Actor actor = actorDAO.querySingle("select * from actor where id = ?", Actor.class,6);
        System.out.println("===查询单行结果===");
        System.out.println(actor);

        Object o = actorDAO.queryScalar("select name from actor where id = ?", 6);
        System.out.println("===查询单行单列值===");
        System.out.println(o);

        int update = actorDAO.update("insert into actor values(null,?,?,?,?)","zhang","男","2001-1-2","234");
        System.out.println(update > 0 ? "执行成功" : "执行没有影响表");
    }
}
