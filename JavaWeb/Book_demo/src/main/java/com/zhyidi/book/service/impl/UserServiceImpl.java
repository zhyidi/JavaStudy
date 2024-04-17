package com.zhyidi.book.service.impl;

import com.zhyidi.book.dao.UserDao;
import com.zhyidi.book.dao.impl.UserDaoImpl;
import com.zhyidi.book.pojo.User;
import com.zhyidi.book.service.UserService;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/7 10:48
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public boolean RegistUser(User user) {
        return userDao.saveUser(user) != -1;
    }

    @Override
    public boolean login(User user) {
        return userDao.queryForUserByUsernameAndPassword(user.getUsername(),user.getPassword()) != null;
    }

    @Override
    public boolean existUsername(String username) {
        return userDao.queryForUserByUsername(username) != null;
    }
}
