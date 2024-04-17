package com.zhyidi.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/17 19:33
 * @Version 1.0
 */
@Controller
public class ScopeController {
    @RequestMapping(value = "/testRequestByservletApi")
    public String testRequestByservletApi(HttpServletRequest request){
        request.setAttribute("testRequestScope","RequestByservletApi");
        return "success";
    }

    @RequestMapping(value = "/testmodelandview")
    public ModelAndView testmodelandview(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("testRequestScope","hello,modelandview!");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/testmodel")
    public String testmodel(Model model){
        model.addAttribute("testRequestScope","hello,model!");
        System.out.println(model.getClass().getName());
        return "success";
    }

    @RequestMapping(value = "/testmap")
    public String testmap(Map<String, Object> map){
        map.put("testRequestScope","helloMap!");
        System.out.println(map.getClass().getName());
        return "success";
    }

    @RequestMapping(value = "/testmodelmap")
    public String testmodelmap(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope","helloModelMap!");
        System.out.println(modelMap.getClass().getName());
        return "success";
    }

    @RequestMapping(value = "/testsession")
    public String testsession(HttpSession httpSession){
        httpSession.setAttribute("testSessionScope","hello,session!");
        return "success";
    }

    @RequestMapping(value = "/testapplication")
    public String testapplication(HttpServletRequest request){
        ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("testApplicationScope","hello,application!");
        return "success";
    }
}
