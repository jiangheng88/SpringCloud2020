package com.msun.cloud.controller;


import com.msun.cloud.entity.Dept;
import com.msun.cloud.service.DeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    //private static final String URL_PREFIX="http://SPRINGCLOUD-DEPT";
    //@Resource
    //private RestTemplate restTemplate;
    @Resource
    private DeptService deptService;
    @RequestMapping("/customer/list")
    public List<Dept> list(){
        return (List<Dept>) deptService.list();
    }
    @GetMapping("/customer/getDept/{id}")
    public Dept getDept(@PathVariable("id") long id){
       Dept dept =  deptService.getDept(id);
       if(dept==null){
           throw  new RuntimeException("没有你要查询的信息");
       }
        return dept;
    }

}
