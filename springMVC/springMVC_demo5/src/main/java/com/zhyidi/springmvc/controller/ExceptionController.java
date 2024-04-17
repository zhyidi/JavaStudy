package com.zhyidi.springmvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/21 12:19
 * @Version 1.0
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public String testExceptionHandler(Exception exception, Model model){
        model.addAttribute("ex",exception);
        return "error";
    }
}
