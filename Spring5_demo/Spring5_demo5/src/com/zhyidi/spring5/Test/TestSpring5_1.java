package com.zhyidi.spring5.Test;

import com.zhyidi.spring5.Bean.User;
import com.zhyidi.spring5.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/13 15:00
 * @Version 1.0
 */
public class TestSpring5_1 {
    @Test
    public void test_Add(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        userService.Regist(new User(null,"zhyidi","zhyidi","zhyidi@vip.qq.com"));
    }


    @Test
    public void test_update(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        userService.Update(new User(4,"zhyidi1","zhyidi1","zhyidi1@vip.qq.com"));
    }

    @Test
    public void test_delete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        userService.Delete(4);
    }

    @Test
    public void test_selectvalue(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        int count = userService.queryForValue();
        System.out.println("共有"+count+"行数据！");
    }

    @Test
    public void test_selectUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        User user = userService.queryForUser(1);
        System.out.println(user);
    }

    @Test
    public void test_selectList(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        List<User> users = userService.queryForList();
        System.out.println(users);
    }

    @Test
    public void test_batchAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] ob1 = {"zhyidi1","zhyidi1","zhyidi1@vip.qq.com"};
        Object[] ob2 = {"zhyidi2","zhyidi2","zhyidi2@vip.qq.com"};
        Object[] ob3 = {"zhyidi3","zhyidi3","zhyidi3@vip.qq.com"};
        batchArgs.add(ob1);
        batchArgs.add(ob2);
        batchArgs.add(ob3);
        userService.batchAdd(batchArgs);
    }

    @Test
    public void test_batchDelete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] ob1 = {5};
        Object[] ob2 = {6};
        Object[] ob3 = {7};
        batchArgs.add(ob1);
        batchArgs.add(ob2);
        batchArgs.add(ob3);
        userService.batchDelete(batchArgs);
    }
}
