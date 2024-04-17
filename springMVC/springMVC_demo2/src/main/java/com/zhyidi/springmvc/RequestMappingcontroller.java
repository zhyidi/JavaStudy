package com.zhyidi.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/17 11:34
 * @Version 1.0
 */
@Controller
//@RequestMapping(value = "/hello")
public class RequestMappingcontroller {

    @RequestMapping(value = "/testRequestMapping")
    public String testRequestMapping(){
        return "success";
    }

    @RequestMapping(
            value = {"/testRequestMapping1","/testRequestMapping2"},
            method = {RequestMethod.GET,RequestMethod.POST}
    )
    public String testRequestMapping1(){
        return "success";
    }

    @GetMapping(value = "/testGetMapping")
    public String testGetMapping(){
        return "success";
    }

    @RequestMapping(
            value = "testparams",
            params = {"username"}
    )
    public String testparams(){
        return "success";
    }

//    @RequestMapping(value = "/a?a/testant")
//    @RequestMapping(value = "/a*a/testant")
    @RequestMapping(value = "/a**a/testant")
    public String testant(){
        return "success";
    }

    @RequestMapping(value = "/testpath/{id}")
    public String testpath(@PathVariable("id") Integer id){
        System.out.println("id"+id);
        return "success";
    }
}
