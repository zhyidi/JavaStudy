package com.zhyidi.ssm.service;

import com.zhyidi.ssm.bean.Employee;
import com.zhyidi.ssm.bean.EmployeeExample;
import com.zhyidi.ssm.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/6/4 16:20
 * @Version 1.0
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> getAllEmp() {
        return employeeMapper.selectByExampleWithDept(null);
    }

    public void saveEmp(Employee employee) {
        employeeMapper.insertSelective(employee);
    }

    public boolean checkuser(String empName) {
        EmployeeExample employeeExample = new EmployeeExample();
        employeeExample.createCriteria().andEmpNameEqualTo(empName);
        long count = employeeMapper.countByExample(employeeExample);
        return count==0;
    }
}
