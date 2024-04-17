package com.zhyidi.spring5.Test;

import com.zhyidi.spring5.Config.Configtx;
import com.zhyidi.spring5.Service.UserService;
import com.zhyidi.spring5.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/14 9:40
 * @Version 1.0
 */
public class TestSpring5_1 {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.addmoney(1, BigDecimal.valueOf(100));
        userService.reducemoney(2, BigDecimal.valueOf(100));

    }

    //转账（无事务）
    @Test
    public void test_zhuan(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.zhuanmoney(1, 2, BigDecimal.valueOf(200));

    }

    //转账（有事务）
    @Test
    public void test_zhuan_plus(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.zhuanmoney_plus(1, 2, BigDecimal.valueOf(200));

    }

    //转账（有事务）
    @Test
    public void test_zhuan_plus1(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(Configtx.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.zhuanmoney_plus1(1, 2, BigDecimal.valueOf(200));

    }

    //转账（有事务）
    @Test
    public void test_zhuan_plus2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.zhuanmoney_plus2(1, 2, BigDecimal.valueOf(200));

    }

    //函数式注册对象(new的对象交给spring管理)
    @Test
    public void test_GAC(){
        GenericApplicationContext context = new GenericApplicationContext();
        //对象注册
        context.refresh();
        //public final <T> void registerBean(Class<T> beanClass, Supplier<T> supplier, BeanDefinitionCustomizer... customizers)
        //Supplier省略return关键字
        context.registerBean("user1",User.class,()->new User());

//        User user = (User) context.getBean("com.zhyidi.spring5.pojo.User");
        User user1 = context.getBean("user1", User.class);
        System.out.println(user1);

    }

}
