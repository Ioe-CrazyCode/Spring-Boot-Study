package com.ioenn.redis;


import jdk.internal.instrumentation.Logger;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class RedisApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    RedisDao redisDao;
    @Test
    public  void testRedis(){
        redisDao.setKey("name","ioenn");
        redisDao.setKey("age","18");
        System.out.println("名字："+redisDao.getValue("name"));
        System.out.println("年龄："+redisDao.getValue("age"));
    }

}
