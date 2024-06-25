package com.gbs.staging.jedis.factory;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.time.Duration;

public class JedisConnectionFactory {

    private static final JedisPool jedisPool;

    static {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        //最大连接数量
        jedisPoolConfig.setMaxTotal(8);

        jedisPoolConfig.setMaxIdle(8);

        jedisPoolConfig.setMinIdle(0);

        jedisPoolConfig.setMaxWait(Duration.ofMillis(1000));

        jedisPool=new JedisPool(jedisPoolConfig,"127.0.0.1",6379);
    }

    public static Jedis getJedis(){
        return jedisPool.getResource();
    }
}
