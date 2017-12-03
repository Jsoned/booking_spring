package com.ssm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

/**
 * 静态注入中间类
 * 完成RedisCache.jedisConnectionFactory的静态注入
 * Created by jinyixin on 2017/11/28
 */
public class RedisCacheTransfer {

  @Autowired
  public void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
    RedisCache.setJedisConnectionFactory(jedisConnectionFactory);
  }
}
