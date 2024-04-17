package com.zhyidi.spring5.Test;

import com.zhyidi.spring5.Aopanno.User;
import com.zhyidi.spring5.Config.ConfigAOP;
import com.zhyidi.spring5.Dao.UserDao;
import com.zhyidi.spring5.Dao.UserDaoImpl;
import com.zhyidi.spring5.aopxml.Book;
import com.zhyidi.spring5.utils.JDKProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 21:20
 * @Version 1.0
 */
public class TestSpring5_1 {
    //jdk动态代理
    @Test
    public void test(){
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao) JDKProxy.getProxy(userDao);
        int result1 = userDao1.add(1,2);
        String result2 = userDao1.update("1234");
        System.out.println(result1);
        System.out.println(result2);
    }
    //AspectJ注解代理
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    //AspectJ配置文件代理
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }

    //AspectJ注解代理（完全注解）
    @Test
    public void test3(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAOP.class);
        User user = context.getBean("user", User.class);
        user.add();
    }
}
