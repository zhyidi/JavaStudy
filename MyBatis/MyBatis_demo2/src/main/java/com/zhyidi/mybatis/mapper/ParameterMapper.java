package com.zhyidi.mybatis.mapper;

import com.zhyidi.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    /**
     * @Description: 获取全部用户
     * @Author zhyidi
     * @Param
     * @return
     * @Date 11:57 2022/5/22
     **/
    List<User> getAllUser();

    /**
     * @Description: 根据用户名查询用户信息
     * @Author zhyidi
     * @Param
     * @return
     * @Date 15:16 2022/5/22
     **/
    User getUserByUsername(String username);

    /**
     * @Description: 通过用户名密码验证登录
     * @Author zhyidi
     * @Param
     * @return
     * @Date 15:26 2022/5/22
     **/
    User checkLogin(String username,String password);

    /**
     * @Description: 通过用户名密码验证登录（map集合）
     * @Author zhyidi
     * @Param
     * @return
     * @Date 15:26 2022/5/22
     **/
    User checkLoginMap(Map<String,Object> map);

    /**
     * @Description: 通过用户名密码验证登录（命名参数）
     * @Author zhyidi
     * @Param
     * @return
     * @Date 15:26 2022/5/22
     **/
    User checkLoginParam(@Param("username") String username, @Param("password") String password);

    /**
     * @Description: 添加用户
     * @Author zhyidi
     * @Param
     * @return
     * @Date 15:44 2022/5/22
     **/
    int insertUser(User user);
}
