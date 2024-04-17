package com.zhyidi.spring5.Test;

import com.zhyidi.spring5.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;
import java.math.BigDecimal;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/14 20:04
 * @Version 1.0
 */
//整合Junit4
@RunWith(SpringJUnit4ClassRunner.class)     //单元测试框架
@ContextConfiguration("classpath:bean1.xml")    //加载配置文件
public class TestSpring5_2 {
    @Autowired
    private UserService userService;

    //TestSpring5_1中方法
    @Test
    public void test1(){
        userService.addmoney(1, BigDecimal.valueOf(100));
        userService.reducemoney(2, BigDecimal.valueOf(100));

    }
}
