package com.zhyidi.spring5.Test;

import com.zhyidi.spring5.collectionType.Book;
import com.zhyidi.spring5.collectionType.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 16:06
 * @Version 1.0
 */
public class TestSpring5_2 {
    @Test
    public void test1(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book1", Book.class);
        Book book2 = context.getBean("book1", Book.class);
        System.out.println(book1.getList());
        System.out.println(book2.getList());
        System.out.println(book1);
        System.out.println(book2);
    }
}
