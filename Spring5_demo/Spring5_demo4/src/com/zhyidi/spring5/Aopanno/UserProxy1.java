package com.zhyidi.spring5.Aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/12 21:48
 * @Version 1.0
 */

@Component
@Aspect
@Order(3)
public class UserProxy1 {
    //前置通知
    @Before(value = "execution(* com.zhyidi.spring5.Aopanno.User.add(..))")
    public void before(){
        System.out.println("before1...");
    }
}
