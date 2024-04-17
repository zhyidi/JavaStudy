package org.zhyidi.boot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/6/7 16:49
 * @Version 1.0
 */

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String handler01(){
        return "Hello,spring boot2!";
    }
}
