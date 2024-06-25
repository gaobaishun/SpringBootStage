package com.gbs.staging.database;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gbs.staging.pojo.SerProject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * lett
 */
@SpringBootTest
public class RedisTest {

    @Autowired
    RedisTemplate redisTemplate;

    private static Logger logger= LogManager.getLogger(RedisTest.class);
    @Test
    public void redisTest1(){

        redisTemplate.opsForValue().set("test1","gao");
        logger.info(redisTemplate.opsForValue().get("test1"));
    }

    @Test
    public void redisTest2() throws JsonProcessingException {
        SerProject dsd = new SerProject(12, "dsd");
        //String s = new ObjectMapper().writeValueAsString(dsd);
        redisTemplate.opsForValue().set("project",dsd);
        logger.info("redisTest2:{}",redisTemplate.opsForValue().get("project"));
    }
}
