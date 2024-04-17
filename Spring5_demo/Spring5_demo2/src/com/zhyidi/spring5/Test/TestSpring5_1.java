package com.zhyidi.spring5.Test;

import com.zhyidi.spring5.collectionType.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 15:42
 * @Version 1.0
 */
public class TestSpring5_1 {

    @Test
    public void test1(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu1 = context.getBean("stu1", Stu.class);
        stu1.test();

    }
}
