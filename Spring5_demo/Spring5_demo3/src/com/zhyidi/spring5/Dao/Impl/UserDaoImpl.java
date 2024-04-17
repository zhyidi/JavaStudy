package com.zhyidi.spring5.Dao.Impl;

import com.zhyidi.spring5.Dao.UserDao;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 19:54
 * @Version 1.0
 */

@Component(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add被调用了");
    }
}
