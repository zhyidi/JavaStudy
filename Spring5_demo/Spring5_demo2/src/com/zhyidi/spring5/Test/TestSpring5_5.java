package com.zhyidi.spring5.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 18:07
 * @Version 1.0
 */
public class TestSpring5_5 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        try {
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
