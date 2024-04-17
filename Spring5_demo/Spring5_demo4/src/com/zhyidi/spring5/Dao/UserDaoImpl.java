package com.zhyidi.spring5.Dao;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 21:03
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String update(String Id) {
        return Id;
    }
}
