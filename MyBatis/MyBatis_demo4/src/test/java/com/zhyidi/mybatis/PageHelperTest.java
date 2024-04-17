package com.zhyidi.mybatis;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhyidi.mybatis.mapper.EmpMapper;
import com.zhyidi.mybatis.pojo.Emp;
import com.zhyidi.mybatis.pojo.EmpExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/28 10:37
 * @Version 1.0
 */
public class PageHelperTest {
    @Test
    public void testPageHelper(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            PageHelper.startPage(5,2);
            List<Emp> emps = mapper.selectByExample(null);
            PageInfo<Emp> pageInfo = new PageInfo<>(emps,5);
            emps.forEach(System.out::println);
            System.out.println(pageInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
