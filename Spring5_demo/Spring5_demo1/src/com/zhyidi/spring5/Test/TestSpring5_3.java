package com.zhyidi.spring5.Test;

import com.zhyidi.spring5.Beans.Employee;
import com.zhyidi.spring5.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 15:23
 * @Version 1.0
 */
public class TestSpring5_3 {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Employee emp1 = context.getBean("emp1", Employee.class);
        System.out.println(emp1.toString());
        emp1.add();

    }
}
