package com.zhyidi.book.dao;

import com.zhyidi.book.pojo.User;

/**
 * @Description:UserDao的接口
 * @Author zhyidi
 * @Date: 2022/5/7 10:09
 * @Version 1.0
 */
public interface UserDao {
    /**
     * @Description: 根据用户名查询用户信息
     * @Author zhyidi
     * @Param
     * @return
     * @Date 10:10 2022/5/7
     **/
    User queryForUserByUsername(String username);

    /**
     * @Description: 根据用户名和密码查询用户信息
     * @Author zhyidi
     * @Param
     * @return
     * @Date 10:10 2022/5/7
     **/
    User queryForUserByUsernameAndPassword(String username,String password);

    /**
     * @Description: 保存用户信息
     * @Author zhyidi
     * @Param
     * @return
     * @Date 10:12 2022/5/7
     **/
    int saveUser(User user);


}
