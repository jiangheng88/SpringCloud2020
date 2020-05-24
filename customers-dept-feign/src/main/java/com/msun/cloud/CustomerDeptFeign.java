package com.msun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description:
 * @Company：众阳健康
 * @Author: jiangheng
 * @Date: 2020/4/26 22:03
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.msun.cloud"})
@ComponentScan("com.msun.cloud")
public class CustomerDeptFeign {
    public static void main(String[] args) {
        SpringApplication.run(CustomerDeptFeign.class, args);
    }
}
