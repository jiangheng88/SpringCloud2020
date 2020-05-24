package com.msun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description:
 * @Company：众阳健康
 * @Author: jiangheng
 * @Date: 2020/4/28 16:06
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7003 {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7003.class, args);
    }

}
