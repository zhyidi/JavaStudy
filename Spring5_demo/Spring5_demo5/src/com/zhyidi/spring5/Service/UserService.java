package com.zhyidi.spring5.Service;

import com.zhyidi.spring5.Bean.User;

import java.util.List;

public interface UserService {
    void Regist(User user);
    void Delete(int id);
    void Update(User user);
    int queryForValue();
    User queryForUser(int id);
    List<User> queryForList();
    int[] batchAdd(List<Object[]> batchArgs);
    int[] batchDelete(List<Object[]> batchArgs);
}
