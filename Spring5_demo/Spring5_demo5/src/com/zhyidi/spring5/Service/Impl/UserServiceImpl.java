package com.zhyidi.spring5.Service.Impl;

import com.zhyidi.spring5.Bean.User;
import com.zhyidi.spring5.DAO.UserDao;
import com.zhyidi.spring5.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/12 22:46
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;

    @Override
    public void Regist(User user) {
        userDao.save(user);
    }

    @Override
    public void Delete(int id) {
        userDao.delete(id);
    }

    @Override
    public void Update(User user) {
        userDao.update(user);
    }

    @Override
    public int queryForValue() {
        int count = userDao.queryForValue();
        return count;

    }

    @Override
    public User queryForUser(int id) {
        return userDao.queryForUser(id);
    }

    @Override
    public List<User> queryForList() {
        List<User> users = userDao.queryForList();
        return users;

    }

    @Override
    public int[] batchAdd(List<Object[]> batchArgs) {
        return userDao.batchAdd(batchArgs);
    }

    @Override
    public int[] batchDelete(List<Object[]> batchArgs) {
        return userDao.batchDelete(batchArgs);
    }

}
