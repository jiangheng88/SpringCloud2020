package com.msun.cloud.factory;

import com.msun.cloud.entity.Dept;
import com.msun.cloud.service.DeptService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description:
 * @Company：众阳健康
 * @Author: jiangheng
 * @Date: 2020/4/29 14:55
 * @Version 1.0
 */
@Component
public class DeptServiceFallMethod implements FallbackFactory<DeptService> {
    @Override
    public DeptService create(Throwable cause) {
        return new DeptService() {
            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public int insert(Dept dept) {
                return 0;
            }

            @Override
            public Dept getDept(long id) {
                Dept dept = new Dept();
                dept.setDeptNo(id);
                dept.setDeptName("没有改deptNo 对应的 内容");
                dept.setDbSource("没有改deptNo 对应的数据库");
                return dept;
            }
        };
    }
}
