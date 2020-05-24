package com.msun.cloud.service;

import com.msun.cloud.entity.Dept;

import java.util.List;

/**
 * @Description:
 * @Company：众阳健康
 * @Author: jiangheng
 * @Date: 2020/4/26 20:29
 * @Version 1.0
 */
public interface DeptService {
    public List<Dept> list();
    public int insert(Dept dept);

    Dept getDept(long id);
}
