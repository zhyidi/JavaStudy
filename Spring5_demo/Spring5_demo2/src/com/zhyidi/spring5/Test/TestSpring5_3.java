package com.zhyidi.spring5.Test;

import com.zhyidi.spring5.Bean.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 17:03
 * @Version 1.0
 */
public class TestSpring5_3 {
    @Test
    public void test1(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean3.xml");
        Orders order1 = context.getBean("order1", Orders.class);
        System.out.println(order1);
        ((ClassPathXmlApplicationContext)context).close();
    }
}
