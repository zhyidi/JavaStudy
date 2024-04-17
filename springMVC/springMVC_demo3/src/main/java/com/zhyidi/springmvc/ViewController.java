package com.zhyidi.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/17 20:57
 * @Version 1.0
 */
@Controller
public class ViewController {

    @RequestMapping(value = "/testThymeleaf")
    public String testThymeleaf(){
        return "success";
    }

    @RequestMapping(value = "/testForward")
    public String testForward(){
        return "forward:/testThymeleaf";
    }

    @RequestMapping(value = "/testRedirect")
    public String testRedirect(){
        return "redirect:/testThymeleaf";
    }

}
