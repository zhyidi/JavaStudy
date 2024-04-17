package com.zhyidi.springjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/17 22:06
 * @Version 1.0
 */
@Controller
public class controller {

    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
