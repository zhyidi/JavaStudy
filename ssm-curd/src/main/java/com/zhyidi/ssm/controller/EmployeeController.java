package com.zhyidi.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhyidi.ssm.bean.Employee;
import com.zhyidi.ssm.bean.Msg;
import com.zhyidi.ssm.service.EmployeeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/6/4 16:16
 * @Version 1.0
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    /**
     * @Description: 查询员工数据（分页查询）
     * @Author zhyidi
     * @Param
     * @return
     * @Date 16:19 2022/6/4
     **/
    /*@RequestMapping("/listEmps")
    public String getEmps(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
        PageHelper.startPage(pn,5);
        //startPage后紧跟的查询就是分页
        List<Employee> allEmps = employeeService.getAllEmp();
        //封装详细的分页信息(navigatePages为连续的页码)
        PageInfo page = new PageInfo(allEmps,5);
        model.addAttribute("pageInfo",page);
        return "listEmps";
    }*/
    @RequestMapping("/listEmps")
    @ResponseBody
    public Msg getEmpsWithJson(@RequestParam(value = "pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,5);
        //startPage后紧跟的查询就是分页
        List<Employee> allEmps = employeeService.getAllEmp();
        //封装详细的分页信息(navigatePages为连续的页码)
        PageInfo page = new PageInfo(allEmps,5);
        return Msg.msgSuccess().add("pageInfo",page);
    }


    /**
     * @Description: 员工保存
     * @Author zhyidi
     * @Param
     * @return
     * @Date 10:31 2022/6/5
     **/
    @RequestMapping(value = "/saveEmp",method = RequestMethod.POST)
    @ResponseBody
    public Msg saveEmp(@Valid Employee employee, BindingResult result){
        if(result.hasErrors()){
            Map<String,Object> map = new HashMap<>();
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError error : errors) {
                map.put(error.getField(),error.getDefaultMessage());
            }
            return Msg.msgFail().add("errorFields",map);
        }else
        {
            employeeService.saveEmp(employee);
            return Msg.msgSuccess();
        }
    }

    /**
     * @Description: 校验用户名
     * @Author zhyidi
     * @Param
     * @return
     * @Date 11:19 2022/6/5
     **/
    @RequestMapping(value = "/checkuser")
    @ResponseBody
    public Msg checkuser(String empName){
        boolean result = employeeService.checkuser(empName);
        return result ? Msg.msgSuccess():Msg.msgFail().add("va_msg","用户名已存在");
    }
}
