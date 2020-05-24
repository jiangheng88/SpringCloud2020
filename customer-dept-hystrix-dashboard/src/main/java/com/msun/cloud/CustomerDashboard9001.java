package com.msun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description:
 * @Company：众阳健康
 * @Author: jiangheng
 * @Date: 2020/4/30 10:06
 * @Version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class CustomerDashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(CustomerDashboard9001.class, args);
    }
}
