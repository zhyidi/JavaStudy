package com.zhyidi.spring5.Test;

import com.zhyidi.spring5.Service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/14 20:16
 * @Version 1.0
 */
//整合Junit5
//第一种：
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean1
// .xml")    //加载配置文件
//第二种：(复合注解)
@SpringJUnitConfig(locations = "classpath:bean1.xml")
public class TestSpring5_3 {

    @Autowired
    private UserService userService;

    //TestSpring5_1中方法
    @Test
    public void test1(){
        userService.addmoney(1, BigDecimal.valueOf(100));
        userService.reducemoney(2, BigDecimal.valueOf(100));

    }
}
