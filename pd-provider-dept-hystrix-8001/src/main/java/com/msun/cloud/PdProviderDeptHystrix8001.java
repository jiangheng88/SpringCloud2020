package com.msun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @Company：众阳健康
 * @Author: jiangheng
 * @Date: 2020/4/26 20:42
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient  //服务发现
@EnableCircuitBreaker   //服务熔断的注解
public class PdProviderDeptHystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(PdProviderDeptHystrix8001.class, args);
    }
}
