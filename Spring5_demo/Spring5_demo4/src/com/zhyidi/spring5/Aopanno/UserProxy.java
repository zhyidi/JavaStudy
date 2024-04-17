package com.zhyidi.spring5.Aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 22:49
 * @Version 1.0
 */

//增强的类
@Component
@Aspect
@Order(1)   //优先级越小越高
public class UserProxy {
    //抽取相同切入点
    @Pointcut(value = "execution(* com.zhyidi.spring5.Aopanno.User.add(..))")
    public void pointdemo(){

    }

    //前置通知
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("before...");
    }

    @AfterReturning(value = "pointdemo()")
    public void afterReturning(){
        System.out.println("afterReturning...");
    }
    @AfterThrowing(value = "pointdemo()")
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }

    @After(value = "pointdemo()")
    public void after(){
        System.out.println("after...");
    }

    @Around(value = "pointdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around之前...");
        proceedingJoinPoint.proceed();
        System.out.println("around之后...");
    }

}
