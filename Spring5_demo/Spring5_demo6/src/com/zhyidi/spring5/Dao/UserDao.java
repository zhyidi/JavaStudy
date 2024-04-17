package com.zhyidi.spring5.Dao;


import java.math.BigDecimal;

public interface UserDao{
    /**
     * @Description: 少钱
     * @Author zhyidi
     * @Param
     * @return
     * @Date 9:35 2022/5/14
     **/
    void reducemoney(int id, BigDecimal money);
    void addmoney(int id, BigDecimal money);
}
