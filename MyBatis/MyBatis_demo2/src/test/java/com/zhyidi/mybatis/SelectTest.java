package com.zhyidi.mybatis;

import com.zhyidi.mybatis.mapper.SelectMapper;
import com.zhyidi.mybatis.pojo.User;
import com.zhyidi.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/22 16:26
 * @Version 1.0
 */
public class SelectTest {
    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(5);
        System.out.println(user);
    }

    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> user = mapper.getAllUser();
        user.forEach(System.out::println);
    }

    @Test
    public void testGetCount(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        int row_count = mapper.getCount();
        System.out.println(row_count);
    }

    @Test
    public void testGetUserToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> userToMap = mapper.getUserToMap(5);
        userToMap.forEach((name,o)->System.out.println(name+":"+o));
    }

    @Test
    public void testGetAllUserToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Map<String, Object>> allUserToMap = mapper.getAllUserToMap();
        allUserToMap.forEach(O-> {
            O.forEach((name,o)->System.out.println(name+":"+o));
            System.out.println("====================");
        });
    }

    @Test
    public void testGetAllUserToMap1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<Integer, Object> allUserToMap1 = mapper.getAllUserToMap1();
        allUserToMap1.forEach((id,user)->{
            System.out.println("id为:"+id+"的用户信息：");
            System.out.println(user);
            System.out.println("==========================");
        });
    }
}
