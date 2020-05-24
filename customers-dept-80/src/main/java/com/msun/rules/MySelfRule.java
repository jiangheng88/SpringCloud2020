package com.msun.rules;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:  自定义的负载均衡 规则
 * @Company：众阳健康
 * @Author: jiangheng
 * @Date: 2020/4/29 8:44
 * @Version 1.0
 */

@Configuration
public class MySelfRule {
    /**
     * @return
     * @Date 2020/4/29 8:49
     * @Author jiangheng
     * @Description //TODO 自定义的负载均衡算法 (随机算法)
     **/
    @Bean
    public IRule myRule(){
        //return new RandomRule();
        // 自定义的 算法
        return new RandomRule_JH();
    }
}
