package com.zhyidi.spring5.Service;

import com.zhyidi.spring5.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/14 9:31
 * @Version 1.0
 */

//事务一般加在Service层，Dao层只考虑对数据库的操作
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    //少钱
    public void reducemoney(int id, BigDecimal money) {
        userDao.reducemoney(id,money);
    }
    //多钱
    public void addmoney(int id, BigDecimal money) {
        userDao.addmoney(id,money);
    }
    //转账（编程式事务管理）
    public void zhuanmoney(int id1, int id2,BigDecimal money) {
        try{
            //第一步：开启事务（使以下业务中操作不会commit）

            //第二步：业务
            userDao.reducemoney(id1,money);
            int a = 3/0;
            userDao.addmoney(id2,money);

        }catch (Exception exception){
            //回滚
        }
    }

    //转账（注解声明式事务管理）
    @Transactional  //事务注解（可以在类上面（代表所有方法），也可以在方法上）
    public void zhuanmoney_plus(int id1, int id2,BigDecimal money) {
        userDao.reducemoney(id1,money);
        int a = 3/0;
        userDao.addmoney(id2,money);
    }

    //转账（注解--事务的传播行为）
    @Transactional(propagation = Propagation.REQUIRES_NEW)  //事务注解（可以在类上面（代表所有方法），也可以在方法上）
    public void zhuanmoney_plus1(int id1, int id2,BigDecimal money) {
        userDao.reducemoney(id1,money);
        userDao.addmoney(id2,money);
    }

    //转账（xml声明式事务管理）
    public void zhuanmoney_plus2(int id1, int id2,BigDecimal money) {
        userDao.reducemoney(id1,money);
        int a = 3/0;
        userDao.addmoney(id2,money);
    }
}
