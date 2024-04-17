package com.zhyidi.spring5.Test;

import com.zhyidi.spring5.Bean.Orders;
import com.zhyidi.spring5.autowrite.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 17:35
 * @Version 1.0
 */
public class TestSpring5_4 {
    @Test
    public void test1(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp1", Emp.class);
        System.out.println(emp);
    }

    @Test
    public void test2(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp1 = context.getBean("emp1", Emp.class);
        System.out.println(emp1);
        Emp emp2 = context.getBean("emp2", Emp.class);
        System.out.println(emp2);
        System.out.println(emp1 == emp2);
    }
}
