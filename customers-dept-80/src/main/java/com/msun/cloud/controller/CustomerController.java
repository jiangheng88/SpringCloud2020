package com.msun.cloud.controller;


import com.msun.cloud.entity.Dept;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Company：众阳健康
 * @Author: jiangheng
 * @Date: 2020/4/26 21:57
 * @Version 1.0
 */
@RestController
public class CustomerController {
    //这个路径是微服务的访问路径
    private static final String URL_PREFIX="http://SPRINGCLOUD-DEPT";
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping("/customer/list")
    public List<Dept> list(){
        return (List<Dept>) restTemplate.getForObject(URL_PREFIX+"/listDept",List.class);
    }
}
