package com.zhyidi.spring5.Aopanno;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 22:48
 * @Version 1.0
 */
@Component
public class User {
    public void add(){
//        int a=1/0;
        System.out.println("add...");
    }
}
