package com.zhyidi.spring5.Test;

import com.zhyidi.spring5.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 15:03
 * @Version 1.0
 */
public class Testspring5_2 {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.service();

    }
}
