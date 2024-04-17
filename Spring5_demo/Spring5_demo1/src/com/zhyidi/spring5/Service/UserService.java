package com.zhyidi.spring5.Service;

import com.zhyidi.spring5.Dao.Impl.UserDaoImpl;
import com.zhyidi.spring5.Dao.UserDao;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 14:52
 * @Version 1.0
 */
public class UserService {
    private UserDao userDao = null;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void service(){
        System.out.println("service...");
        /*
        //第一种方式
        userDao = new UserDaoImpl();
        */
        //第二种方式：
        userDao.update();
    }

}
