package com.zhyidi.spring5.Dao.Impl;

import com.zhyidi.spring5.Dao.UserDao;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 14:53
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void update() {
        System.out.println("dao update...");
    }
}
