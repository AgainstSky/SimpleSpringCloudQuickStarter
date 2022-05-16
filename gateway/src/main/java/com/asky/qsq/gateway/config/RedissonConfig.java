package com.asky.qsq.gateway.config;

//import org.redisson.Redisson;
//import org.redisson.api.RedissonClient;
//import org.redisson.codec.JsonJacksonCodec;
//import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * @description: redisson配置类
 * @author: AgainstSky
 * @create: 2022-02-18 14:21
 **/
//@Configuration
//public class RedissonConfig {
//
//    @Value("${redisson.address}")
//    private String address;
//
//    @Bean(destroyMethod="shutdown")
//    RedissonClient redisson() throws IOException {
//        //1、创建配置
//        Config config = new Config();
//        config.useSingleServer()
//                .setAddress(address);
//
//        //设置序列化方式
//        config.setCodec(new JsonJacksonCodec());
//        return Redisson.create(config);
//    }
//
//}
