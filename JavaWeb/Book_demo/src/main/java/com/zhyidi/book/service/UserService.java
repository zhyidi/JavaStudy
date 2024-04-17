package com.zhyidi.book.service;

import com.zhyidi.book.pojo.User;

/**
 * @Description:user业务层
 * @Author zhyidi
 * @Date: 2022/5/7 10:46
 * @Version 1.0
 */
public interface UserService {
    /**
     * @Description:注册
     * @Author zhyidi
     * @Param
     * @return 注册成功返回true，反之false
     * @Date 10:46 2022/5/7
     **/

    boolean RegistUser(User user);
    /**
     * @Description: 登陆
     * @Author zhyidi
     * @Param
     * @return 登陆成功返回true，反之false
     * @Date 10:47 2022/5/7
     **/
    boolean login(User user);

    /**
     * @Description: 查询用户名是否存在
     * @Author zhyidi
     * @Param
     * @return 不存在返回false，存在true
     * @Date 10:47 2022/5/7
     **/
    boolean existUsername(String username);
}
