package com.zhyidi.mybatis;

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
 * @Date: 2022/5/28 9:55
 * @Version 1.0
 */
public class MBGTest {
    @Test
    public void testMBG(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            //查询所有数据
            /*List<Emp> emps = mapper.selectByExample(null);
            emps.forEach(System.out::println);*/
            //根据条件查询
            EmpExample empExample = new EmpExample();
            empExample.createCriteria().andEmpNameEqualTo("李四").andAgeGreaterThanOrEqualTo(0);
            empExample.or().andDidIsNotNull();
            List<Emp> emps = mapper.selectByExample(empExample);
            emps.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
