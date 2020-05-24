package com.msun.cloud.service.impl;

import com.msun.cloud.entity.Dept;
import com.msun.cloud.mapper.DeptMapper;
import com.msun.cloud.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Company：众阳健康
 * @Author: jiangheng
 * @Date: 2020/4/26 20:29
 * @Version 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptMapper deptMapper;
    @Override
    public List<Dept> list() {
        return deptMapper.listDept();
    }

    @Override
    public int insert(Dept dept) {
        return deptMapper.insertSelective(dept);
    }

    @Override
    public Dept getDept(long id) {
        return deptMapper.selectByPrimaryKey(id);
    }
}
