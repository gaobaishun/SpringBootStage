package com.gbs.staging.database;

import com.gbs.staging.jedis.factory.JedisConnectionFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

@SpringBootTest
public class JedisTest {

    private Jedis jedis;

    @BeforeEach
    public void setUp(){
//         jedis=new Jedis("127.0.0.1",6379);
        jedis= JedisConnectionFactory.getJedis();
         //密码
         //jedis.auth();
         jedis.select(0);
    }

    @Test
    void testString(){
        String result=jedis.set("sdf","ddd");
        System.out.println("result="+result);
        String name=jedis.get("sdf");
        System.out.println("name="+name);
    }

    //释放资源
    @AfterEach
    void tearDown(){
        if(jedis != null){
            jedis.close();
        }
    }
}
