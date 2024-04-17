package com.zhyidi.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/18 9:19
 * @Version 1.0
 */
@Controller
public class UserControlller {
    /*
    使用restful模拟用户资源的增删改查
        /User   Get
        /User/1 Get
        /User   POST
        /User/1 Delete
        /User   PUT
     */
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询所有用户信息");
        return "success";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(){
        System.out.println("根据Id查询用户信息");
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insertUser(String username,String password){
        System.out.println("添加用户信息:用户名="+username+",密码="+password);
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String UpdateUser(String username,String password){
        System.out.println("修改用户信息:用户名="+username+",密码="+password);
        return "success";
    }
}
