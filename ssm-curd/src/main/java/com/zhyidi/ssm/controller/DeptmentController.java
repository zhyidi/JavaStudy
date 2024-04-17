package com.zhyidi.ssm.controller;

import com.zhyidi.ssm.bean.Department;
import com.zhyidi.ssm.bean.Msg;
import com.zhyidi.ssm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/6/5 10:12
 * @Version 1.0
 */
@Controller
public class DeptmentController {
    @Autowired
    DepartmentService departmentService;


    @RequestMapping("/listDepts")
    @ResponseBody
    public Msg getDepts(){
        List<Department> allDept = departmentService.getAllDept();
        return Msg.msgSuccess().add("depts",allDept);
    }
}
