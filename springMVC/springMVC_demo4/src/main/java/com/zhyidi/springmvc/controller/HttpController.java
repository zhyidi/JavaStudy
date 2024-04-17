package com.zhyidi.springmvc.controller;

import com.zhyidi.springmvc.pojo.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/18 16:57
 * @Version 1.0
 */
@Controller
public class HttpController {

    @RequestMapping(value = "/testRequestBody",method = RequestMethod.POST)
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println("RequestBody:"+requestBody);
        return "success";
    }

    @RequestMapping(value = "/testRequestEntity",method = RequestMethod.POST)
    public String testRequestEntity(RequestEntity<String> requestEntity){
        System.out.println("RequestBody:"+requestEntity.getBody());
        System.out.println("RequestMethod:"+requestEntity.getMethod());
        System.out.println("RequestHeaders:"+requestEntity.getHeaders());
        return "success";
    }

    @RequestMapping(value = "/testResponse")
    public void testResponse(HttpServletResponse response){
        try {
            response.setHeader("Content-type", "text/html;charset=UTF-8");  		//让浏览器用utf8来解析返回的数据
            response.getWriter().write("HttpServletResponse返回...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/testResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return "ResponseBody返回...";
    }

    @RequestMapping(value = "/testResponseUser")
    @ResponseBody
    public User testResponseUser(){
        return new User(1000,"admin","123456",18,"男");
    }

    @RequestMapping(value = "/testaxios")
    @ResponseBody
    public String testaxios(String username,String password){
        System.out.println(username+":"+password);
        return "hello,axios";
    }
}
