package com.zhyidi.mybatis.mapper;

import com.zhyidi.mybatis.pojo.User;

import java.util.List;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/21 23:22
 * @Version 1.0
 */
public interface UserMapper {
    /**
     * @Description: 添加用户信息
     * @Author zhyidi
     * @Param
     * @return
     * @Date 23:28 2022/5/21
     **/
    int insertUser();
    /**
     * @Description: 删除用户信息
     * @Author zhyidi
     * @Param
     * @return
     * @Date 10:09 2022/5/22
     **/
    int deleteUser();
    /**
     * @Description: 更新用户信息
     * @Author zhyidi
     * @Param
     * @return
     * @Date 10:09 2022/5/22
     **/
    int updateUser();
    /**
     * @Description: 根据id查询用户信息
     * @Author zhyidi
     * @Param
     * @return User
     * @Date 10:21 2022/5/22
     **/
    User getUserById();
    /**
     * @Description: 返回全部实体类对象
     * @Author zhyidi
     * @Param
     * @return
     * @Date 10:30 2022/5/22
     **/
    List<User> getAllUser();
}
