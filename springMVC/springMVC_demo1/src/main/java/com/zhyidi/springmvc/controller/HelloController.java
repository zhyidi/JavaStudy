package com.zhyidi.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/16 8:48
 * @Version 1.0
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/target")
    public String toTarget(){
        return "target";
    }
}
