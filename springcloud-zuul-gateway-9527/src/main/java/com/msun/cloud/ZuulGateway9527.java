package com.msun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description:
 * @Company：众阳健康
 * @Author: jiangheng
 * @Date: 2020/4/30 10:47
 * @Version 1.0
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway9527.class, args);
    }
}
