package com.zhyidi.spring5.Dao.Impl;

import com.zhyidi.spring5.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/14 9:30
 * @Version 1.0
 */
@Repository
public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public void reducemoney(int id, BigDecimal money) {
        String sql = "update t_account set money=money-? where id=?";
        update(sql,money,id);
    }

    @Override
    public void addmoney(int id, BigDecimal money) {
        String sql = "update t_account set money=money+? where id=?";
        update(sql,money,id);
    }
}
