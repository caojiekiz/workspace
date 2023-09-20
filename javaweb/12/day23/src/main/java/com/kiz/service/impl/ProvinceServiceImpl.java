package com.kiz.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kiz.dao.ProvinceDao;
import com.kiz.dao.impl.ProvinceDaoImpl;
import com.kiz.domain.Province;
import com.kiz.service.ProvinceService;
import com.kiz.util.JedisPoolUtils;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    private ProvinceDao dao = new ProvinceDaoImpl();

    @Override
    public List<Province> findAll() {
        return dao.findAll();
    }

    @Override
    public String findAllJson() {
        //1.先从redis中查询数据
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");
        if (province_json == null || province_json.length() == 0) {
            System.out.println("redis中没数据,查询数据库...");
            List<Province> ps = dao.findAll();
            ObjectMapper mapper = new ObjectMapper();
            try {
                province_json = mapper.writeValueAsString(ps);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
            jedis.set("province",province_json);
            jedis.close();
        }else{
            System.out.println("redis中有数据");
        }
        return province_json;
    }
}
