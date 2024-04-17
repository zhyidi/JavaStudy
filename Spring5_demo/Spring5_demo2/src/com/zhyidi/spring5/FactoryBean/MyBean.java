package com.zhyidi.spring5.FactoryBean;

import com.zhyidi.spring5.collectionType.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 16:40
 * @Version 1.0
 */
public class MyBean implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
