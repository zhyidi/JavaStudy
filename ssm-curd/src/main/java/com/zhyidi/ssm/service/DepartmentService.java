package com.zhyidi.ssm.service;

import com.zhyidi.ssm.bean.Department;
import com.zhyidi.ssm.bean.Employee;
import com.zhyidi.ssm.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/6/5 10:15
 * @Version 1.0
 */
@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    public List<Department> getAllDept() {
        return departmentMapper.selectByExample(null);
    }
}
