package com.zhyidi.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/21 10:36
 * @Version 1.0
 */
@Controller
public class InterceptorController {
    @RequestMapping("/**/testInterceptor")
    public String testInterceptor(){
        return "success";
    }

    @RequestMapping("/testExceptionHandler")
    public String testExceptionHandler(){
        int a=3/0;
        return "success";
    }
}
