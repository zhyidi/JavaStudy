package com.zhyidi.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/22 12:04
 * @Version 1.0
 */
public class SqlSessionUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;
    }
}
