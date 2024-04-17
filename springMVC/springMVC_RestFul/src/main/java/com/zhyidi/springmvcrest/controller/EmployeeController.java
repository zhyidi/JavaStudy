package com.zhyidi.springmvcrest.controller;

import com.zhyidi.springmvcrest.Dao.EmployeeDao;
import com.zhyidi.springmvcrest.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/18 10:09
 * @Version 1.0
 */

@Controller
public class EmployeeController {
    @Autowired
    @Qualifier(value = "employeeDao")
    private EmployeeDao employeeDao;

    @GetMapping(value = "/employee")
    public String getAllEmployee(Model model){
        Collection<Employee> employee_list = employeeDao.getAll();
        model.addAttribute("employee_list",employee_list);
        return "employee_list";
    }

    @DeleteMapping(value = "/employee/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/employee";
    }

    @PostMapping (value = "/employee")
    public String addEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    @GetMapping(value = "/employee/{id}")
    public String getEmployeeById(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee",employee);
        return "employee_update";
    }

    @PutMapping (value = "/employee")
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }
}
