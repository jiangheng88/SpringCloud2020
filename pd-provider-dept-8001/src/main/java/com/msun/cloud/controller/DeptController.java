package com.msun.cloud.controller;

import com.msun.cloud.entity.Dept;
import com.msun.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Company：众阳健康
 * @Author: jiangheng
 * @Date: 2020/4/26 20:34
 * @Version 1.0
 */
@RestController
public class DeptController {
    @Resource
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/listDept")
    public List<Dept> listDept() {
        return deptService.list();
    }

    //@PostMapping("/insert")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public int insert(Dept dept) {
        int count = deptService.insert(dept);
        return count;
    }
    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("**********" + list);
        List<ServiceInstance> srvList = client.getInstances("SPRINGCLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t" + element.getUri());
        }
        return this.client;
    }
    @GetMapping("/getDept/{id}")
    public Dept getDept(@PathVariable(value = "id") long id){
        return deptService.getDept(id);
    }
}


