package com.zhyidi.springmvc;

import com.zhyidi.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/17 14:38
 * @Version 1.0
 */
@Controller
public class paramsController {
    @RequestMapping(value = "/testServletApi")
    public String testServletApi(HttpServletRequest request,HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username="+username+",password="+password);
        HttpSession session = request.getSession();


        return "success";
    }

    @RequestMapping(value = "/testparam")
    public String testparam(
            @RequestParam(value = "username",required = false,defaultValue = "hehe") String username,
            String password,
            String hobby,
            @RequestHeader(value = "Host") String host,
            @CookieValue(value = "JSESSIONID") String JSESSIONID){
        //hobby可以是字符串接收，也可以时数组
        System.out.println("username="+username+",password="+password+",hobby="+hobby);
        System.out.println("host:"+host);
        System.out.println("JSESSIONID:"+JSESSIONID);
        return "success";
    }

    @RequestMapping(value = "/testpojo")
    public String testpojo(User user){
        System.out.println(user);
        return "success";
    }

}
