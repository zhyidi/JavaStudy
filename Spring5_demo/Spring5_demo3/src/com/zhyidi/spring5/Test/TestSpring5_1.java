package com.zhyidi.spring5.Test;

import com.zhyidi.spring5.Config.SpringConfig;
import com.zhyidi.spring5.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 19:41
 * @Version 1.0
 */
public class TestSpring5_1 {
    //创建bean
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    //属性注入
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.getUserDao().add();
        System.out.println(userService.getName());
    }

    //完全注解开发
    @Test
    public void test3(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.getUserDao().add();
        System.out.println(userService.getName());
    }
}
