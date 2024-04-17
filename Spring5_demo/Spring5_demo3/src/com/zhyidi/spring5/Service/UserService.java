package com.zhyidi.spring5.Service;

import com.zhyidi.spring5.Dao.Impl.UserDaoImpl;
import com.zhyidi.spring5.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 19:38
 * @Version 1.0
 */

@Component(value = "userService")
public class UserService {
    @Autowired
    @Qualifier(value = "userDaoImpl1")
    private UserDao userDao;
    @Value(value = "abc")
    private String name;

    public String getName() {
        return name;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("add...");
    }
}
