package com.gezhiwei.demo.config;

import io.lettuce.core.dynamic.annotation.Value;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: RedisConfig
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2018/12/19 14:20
 * @modified By:
 */
@Configuration
public class RedisConfig {

    @Bean(name = "enericObjectPoolConfig")
    public GenericObjectPoolConfig genericObjectPoolConfig() {
        GenericObjectPoolConfig genericObjectPoolConfig = new GenericObjectPoolConfig();
        genericObjectPoolConfig.setMaxIdle(-1);
        genericObjectPoolConfig.setMaxTotal(1000);
        genericObjectPoolConfig.setMinIdle(10);
        genericObjectPoolConfig.setMaxIdle(100);
        return genericObjectPoolConfig;
    }

    @Bean(name = "redisCluster")
    @ConfigurationProperties(prefix = "spring.redis")
    public JedisClusterFactory redisCluster(){
        JedisClusterFactory jedisClusterFactory = new JedisClusterFactory();
        jedisClusterFactory.setConnectionTimeout(3000);
        jedisClusterFactory.setSoTimeout(3000);
        jedisClusterFactory.setMaxRedirections(5);
        jedisClusterFactory.setGenericObjectPoolConfig(genericObjectPoolConfig());
        Set<String> value = new HashSet<>();
        //dev
//        value.add("172.16.250.194:6405");
//        value.add("172.16.250.5:6401");
//        value.add("172.16.250.5:6402");
//        value.add("172.16.251.94:6402");
//        value.add("172.16.251.94:6403");
//        value.add("172.16.250.194:6406");

        //test
        value.add("172.16.250.194:6409");
        value.add("172.16.250.5:6405");
        value.add("172.16.250.5:6406");
        value.add("172.16.251.94:6406");
        value.add("172.16.251.94:6407");
        value.add("172.16.250.194:6410");

        jedisClusterFactory.setJedisClusterNodes(value);
        return jedisClusterFactory;
    }
}
