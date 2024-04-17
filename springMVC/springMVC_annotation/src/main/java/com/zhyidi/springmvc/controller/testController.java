package com.zhyidi.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/21 15:12
 * @Version 1.0
 */
@Controller
public class testController {
    @RequestMapping(value = "/")
    public String testindex(){
        return "index";
    }

}
