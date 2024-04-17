package com.zhyidi.spring5.DAO;

import com.zhyidi.spring5.Bean.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    void delete(int id);
    void update(User user);
    int queryForValue();
    User queryForUser(int id);
    List<User> queryForList();
    int[] batchAdd(List<Object[]> batchArgs);
    int[] batchDelete(List<Object[]> batchArgs);
}
