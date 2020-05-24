package com.msun.cloud.service;

import com.msun.cloud.entity.Dept;
import com.msun.cloud.factory.DeptServiceFallMethod;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @Description:
 * @Company：众阳健康
 * @Author: jiangheng
 * @Date: 2020/4/29 10:52
 * @Version 1.0
 */
//@FeignClient(value = "SPRINGCLOUD-DEPT")
@FeignClient(value = "SPRINGCLOUD-DEPT",fallbackFactory = DeptServiceFallMethod.class)
public interface DeptService {
    @GetMapping("/listDept")
    public List<Dept> list();
    @PostMapping("/insert")
    public int insert(Dept dept);
    @GetMapping("getDept/{id}")
    public Dept getDept(@PathVariable("id") long id);

}
