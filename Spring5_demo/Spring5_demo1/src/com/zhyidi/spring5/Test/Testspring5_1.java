package com.zhyidi.spring5.Test;

import com.zhyidi.spring5.Beans.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 10:57
 * @Version 1.0
 */
public class Testspring5_1 {
    @Test
    public void testnewbean1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user1", User.class);
        System.out.println(user.toString());
        user.add();
        user = context.getBean("user2",User.class);
        System.out.println(user.toString());
        user.add();
    }

    @Test
    public void testnewbean2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user3", User.class);
        System.out.println(user.toString());
        user.add();
        user = context.getBean("user4",User.class);
        System.out.println(user.toString());
        user.add();
    }

    @Test
    public void testnewbean3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user5", User.class);
        System.out.println(user.toString());
        user.add();
    }
}
