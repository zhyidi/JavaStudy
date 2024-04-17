package com.zhyidi.book.dao.impl;

import com.zhyidi.book.dao.UserDao;
import com.zhyidi.book.pojo.User;
import com.zhyidi.book.utils.JdbcUtils;

import java.sql.Connection;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/7 10:13
 * @Version 1.0
 */
public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User queryForUserByUsername(String username) {
        String sql = "select `id`,`username`,`password`,`email` from t_user where username = ?";
        Connection conn = JdbcUtils.getConnection();
        User user = queryForOne(conn, User.class, sql, username);
        JdbcUtils.close(conn);
        return user;
    }

    @Override
    public User queryForUserByUsernameAndPassword(String username, String password) {
        String sql = "select `id`,`username`,`password`,`email` from t_user where username = ? and password = ?";
        Connection conn = JdbcUtils.getConnection();
        User user = queryForOne(conn, User.class, sql, username,password);
        JdbcUtils.close(conn);
        return user;
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into t_user(`username`,`password`,`email`) values(?,?,?)";
        Connection conn = JdbcUtils.getConnection();
        int update_row = update(conn, sql, user.getUsername(), user.getPassword(), user.getEmail());
        JdbcUtils.close(conn);
        return update_row;
    }
}

