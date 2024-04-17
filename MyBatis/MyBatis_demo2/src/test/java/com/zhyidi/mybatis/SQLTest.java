package com.zhyidi.mybatis;

import com.zhyidi.mybatis.mapper.SQLMapper;
import com.zhyidi.mybatis.pojo.User;
import com.zhyidi.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/22 17:20
 * @Version 1.0
 */
public class SQLTest {
    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> userlist = mapper.getUserByLike("admin");
        userlist.forEach(user -> {
            System.out.println(user);
        });
    }

    @Test
    public void testdeleteMore(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        mapper.deleteMore("6,7,8");
    }

    @Test
    public void testGetUserByTableName(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> userList = mapper.getUserByTableName("t_user");
        userList.forEach(user -> {
            System.out.println(user);
        });
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user = new User(null, "admin1", "admin1", 18, "男", "qq");
        System.out.println(user.getId());
        mapper.insertUser(user);
        System.out.println(user.getId());
    }
}
