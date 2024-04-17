package com.zhyidi.spring5.DAO.Impl;

import com.zhyidi.spring5.Bean.User;
import com.zhyidi.spring5.DAO.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/12 22:47
 * @Version 1.0
 */
@Repository
public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public void save(User user) {
        String sql = "insert into t_user(username,password,email) values(?,?,?)";
        int update_row = update(sql, user.getUsername(), user.getPassword(), user.getEmail());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from t_user where id=?";
        int update_row = update(sql, id);
    }

    @Override
    public void update(User user) {
        String sql = "update t_user set username=?,password=?,email=? where id=?";
        int update_row = update(sql, user.getUsername(), user.getPassword(), user.getEmail(),user.getId());
    }

    @Override
    public int queryForValue() {
        String sql = "select count(*) from t_user";
        Integer integer = queryForValue(Integer.class,sql);
        return integer;
    }

    @Override
    public User queryForUser(int id) {
        String sql = "select `id`,`username`,`password`,`email` from t_user where id=?";
        User user = queryForOne(User.class,sql,id);
        return user;
    }

    @Override
    public List<User> queryForList() {
        String sql = "select `id`,`username`,`password`,`email` from t_user";
        List<User> query = queryForList(User.class,sql);
        return query;
    }

    @Override
    public int[] batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into t_user(username,password,email) values(?,?,?)";
        int[] ints = batchUpdate(sql, batchArgs);
        return ints;
    }

    @Override
    public int[] batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from t_user where id=?";
        int[] ints = batchUpdate(sql, batchArgs);
        return ints;
    }
}
