package com.zhyidi.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/17 11:17
 * @Version 1.0
 */
@Controller
public class controller {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping("/param")
    public String param(){
        return  "req_params";
    }
}
