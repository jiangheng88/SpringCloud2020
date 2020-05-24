package com.msun.cloud;

import com.msun.rules.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Description:
 * @Company：众阳健康
 * @Author: jiangheng
 * @Date: 2020/4/26 22:03
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="SPRINGCLOUD-DEPT",configuration= MySelfRule.class)
public class CustomerDept80 {
    public static void main(String[] args) {
        SpringApplication.run(CustomerDept80.class, args);
    }
}
