package com.mortal.mortalmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注入中心的入口
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication_7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication_7001.class,args);
    }
}
