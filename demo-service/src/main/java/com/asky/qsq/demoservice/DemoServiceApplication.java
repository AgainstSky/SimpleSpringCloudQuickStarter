package com.asky.qsq.demoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;

//@MapperScan("com.againstsky.aicreate.creator.dao")
//@EnableFeignClients

@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.asky.qsq"})
public class DemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }


}
